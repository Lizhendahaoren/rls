package com.rls.sys.common.service.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: Security 配置类
 * @Description : 实现权限控制
 * @date ：2018/4/16 17:58
 */
@Configuration
@EnableWebSecurity  //Spring 4已弃用@EnableWebMvcSecurity。
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyAuthenticationProvider provider;//自定义验证

    @Autowired
    private UserDetailsService userDetailsService;//自定义用户服务

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //允许所有用户访问"/"和"/home"
        http.authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()//其他地址的访问均需验证权限
                .and()
                .formLogin()
                .loginPage("/login") //指定登录页是"/login"
                .defaultSuccessUrl("/hello")//登录成功后默认跳转到"/hello"
                .permitAll() //我们必须允许所有用户访问我们的登录页（例如为验证的用户），这个formLogin().permitAll()方法允许基于表单登录的所有的URL的所有用户的访问。
                .and()
                .logout()
                .logoutSuccessUrl("/home")//退出登录后的默认url是"/home"
                .permitAll();

    }




}
