package com.rls.sys.common.service.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

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
    private MySecurityFilter mySecurityFilter;//过滤器

    @Autowired
    MyAccessDecisionManager myAccessDecisionManager;//决策器

    @Autowired
    private MyUserDetailsService userDetailsService;//自定义用户服务


    //Request层面的配置，对应XML Configuration中的<http>元素
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //允许所有用户访问"/"和"/home"
        http.authorizeRequests()
                .antMatchers("/", "/index", "/swagger-ui.html", "v2/api-docs", "/swagger/**").permitAll();
               /* .anyRequest().authenticated()//其他地址的访问均需验证权限
                .and()
                .formLogin()
                .loginPage("/login") //指定登录页是"/login"
                .defaultSuccessUrl("/index")//登录成功后默认跳转到"/hello"
                .permitAll() //我们必须允许所有用户访问我们的登录页（例如为验证的用户），这个formLogin().permitAll()方法允许基于表单登录的所有的URL的所有用户的访问。
                .and()
                .logout()
                .logoutSuccessUrl("/index")//退出登录后的默认url是"/home"
                .permitAll();*/
        //添加自定义权限过滤器
        // http.addFilterBefore(mySecurityFilter, FilterSecurityInterceptor.class);
    }

    // Web层面的配置，一般用来配置无需安全检查的路径
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico", "/swagger/**");
    }

    //身份验证配置，用于注入自定义身份验证Bean和密码校验规则
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

}
