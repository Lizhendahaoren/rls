package com.rls.sys.common.service.config.security;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: AuthenticationProvider
 * @Description : 提供用户UserDetails的具体验证方式，
 *              在这里可以自定义用户密码的加密、验证方式等等
 * @date ：2018/4/16 20:42
 */
@Component
@Transactional(readOnly = true)
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyAuthenticationProvider.class);


    //自定义验证方式
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
