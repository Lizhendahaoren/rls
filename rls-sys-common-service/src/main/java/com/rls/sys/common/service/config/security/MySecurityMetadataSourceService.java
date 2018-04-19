package com.rls.sys.common.service.config.security;

import com.google.common.collect.Maps;
import com.rls.base.util.RStringUtil;
import com.rls.sys.common.entity.SysResource;
import com.rls.sys.common.entity.SysRole;
import com.rls.sys.common.entity.SysRoleResource;
import com.rls.sys.common.manager.SysResourceMng;
import com.rls.sys.common.manager.SysRoleMng;
import com.rls.sys.common.manager.SysRoleResourceMng;
import com.rls.sys.common.service.service.SysRoleResourceService;
import com.rls.sys.common.service.service.SysRoleService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: FilterInvocationSecurityMetadataSource
 * @Description :
 * 会提取数据库中所有的用户权限，形成权限列表；并循环该权限列表，
 * 通过每个权限再从数据库中提取出该权限所对应的资源列表，并将资源（URL）作为key，权限列表作为value，形成Map结构的数据。
 * @date ：2018/4/18 16:25
 */
@Component
public class MySecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private SysRoleMng sysRoleMng;

    @Autowired
    private SysResourceMng sysResourceMng;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MySecurityMetadataSourceService.class);

    private static HashMap<String, Collection<ConfigAttribute>> map = null;

    /**
     * 加载权限表中所有权限
     */
    public void loadResourceDefine() {
        map = Maps.newHashMap();
        //查询所有角色  --> 根据角色查询所具有资源
        // -->付给map key(url) value   Collection<ConfigAttribute> 角色信息(要注意key和Value的对应性，避免Value的不正确对应形成重复，这样会导致没有权限的人也能访问到不该访问到的资源)
        List<SysRole> sysRoles = sysRoleMng.selectListAll();
        sysRoles.stream().forEach(v -> {
            List<SysResource> sysResources = sysResourceMng.selectListByRoleId(v.getRoleId());//角色下的资源
            sysResources.stream().forEach(s -> {
                String url = s.getResourceUrl();
                Collection<ConfigAttribute> configAttributes = null;
                if (url.length() > 0) { //验证url
                    if (!"/".equals(url.substring(0, 1))) {
                        url = "/" + url;
                    }
                }
                if (map.containsKey(url)) { //验证url 是否已存在 避免Value的不正确对应形成重复
                    configAttributes = map.get(url);
                } else {
                    configAttributes = new ArrayList<>();
                }

                ConfigAttribute configAttribute = new SecurityConfig(
                        v.getRoleName());
                configAttributes.add(configAttribute);//添加角色信息
                map.put(url, configAttributes);
            });
        });
    }

    //此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String url = ((FilterInvocation) object).getRequestUrl();
        int firstQuestionMarkIndex = url.indexOf("?");//判断对URL特别是Action问号之前的部分进行匹配，防止用户请求的带参数的URL与你数据库中定义的URL不匹配，造成访问拒绝
        if (firstQuestionMarkIndex != -1) {
            url = url.substring(0, firstQuestionMarkIndex);
        }
        if (map == null) {
            loadResourceDefine();
        }
        return map.get(url);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    //清空权限信息
    public static void reset() {
        map = null;
    }
}
