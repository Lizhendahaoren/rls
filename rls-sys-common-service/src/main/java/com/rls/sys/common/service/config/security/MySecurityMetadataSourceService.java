package com.rls.sys.common.service.config.security;

import com.google.common.collect.Maps;
import com.rls.sys.common.entity.SysPermission;
import com.rls.sys.common.manager.SysPermissionMng;
import com.rls.sys.common.service.service.SysPermissionService;
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
 *     会提取数据库中所有的用户权限，形成权限列表；并循环该权限列表，
 *     通过每个权限再从数据库中提取出该权限所对应的资源列表，并将资源（URL）作为key，权限列表作为value，形成Map结构的数据。
 * @date ：2018/4/18 16:25
 */
@Component
public class MySecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private SysPermissionMng sysPermissionMng;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MySecurityMetadataSourceService.class);

    private static HashMap<String, Collection<ConfigAttribute>> map = null;

    /**
     * 加载权限表中所有权限
     */
    public void loadResourceDefine(){
        map = new HashMap<>();
        Collection<ConfigAttribute> array;
        ConfigAttribute cfg;
        List<SysPermission> permissions = sysPermissionMng.selectListAll();
        for(SysPermission permission : permissions) {
            array = new ArrayList<>();
            cfg = new SecurityConfig(permission.getPermissionName());
            //此处只添加了用户的名字，其实还可以添加更多权限的信息，例如请求方法到ConfigAttribute的集合中去。此处添加的信息将会作为MyAccessDecisionManager类的decide的第三个参数。
            array.add(cfg);
            //用权限的getUrl() 作为map的key，用ConfigAttribute的集合作为 value，
            map.put(permission.getPermissionUrl(), array);
        }

    }

    //此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String url = ((FilterInvocation) object).getRequestUrl();
        int firstQuestionMarkIndex = url.indexOf("?");
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
    public static void reset(){
        map = null;
    }
}
