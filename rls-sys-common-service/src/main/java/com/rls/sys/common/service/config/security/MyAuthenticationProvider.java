package com.rls.sys.common.service.config.security;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: AuthenticationProvider
 * @Description : ${todo}
 * @date ：2018/4/22 15:19
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        UserDetails user = myUserDetailsService.loadUserByUsername(username);
        if(user == null){
            throw new BadCredentialsException("用户没有找到");
        }

        //加密过程在这里体现
        if (!password.equals(user.getPassword())) {
            logger.info("-----------密码错误-----------");
            throw new BadCredentialsException("密码错误");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
