package com.rls.sys.common.service.config.security;

import com.rls.base.util.RObjectUtil;
import com.rls.base.util.RVerification;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: AccessDecisionManager
 * @Description : 权限决策器
 *                通过过滤器调用 比对 mySecurityMetadataSourceService 的configAttributes 和 authentication
 * @date ：2018/4/18 16:30
 */
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyAccessDecisionManager.class);

    // decide 方法是判定是否拥有权限的决策方法，
    //authentication 是释MyUserDetailsService中循环添加到 GrantedAuthority 对象中的权限信息集合.
    //object 包含客户端发起的请求的requset信息，可转换为 HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
    //configAttributes 为mySecurityMetadataSourceService的getAttributes(Object object)这个方法返回的结果，此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        if(null== configAttributes || configAttributes.size() <=0) {
            return;
        }
        logger.info("-------MyAccessDecisionManager---------decide----------------");
        configAttributes.stream().forEach(v -> {//authentication 为用户认证 中循环添加到 GrantedAuthority 对象中的权限信息集合
            if(authentication.getAuthorities().stream().anyMatch(s -> v.getAttribute().trim().equals(s.getAuthority()))) return;
        });
        throw new AccessDeniedException("no right");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
