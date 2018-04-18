
package com.rls.sys.common.service.config.security;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import java.io.IOException;


/**
 * @author ：lz
 * @version ： 1.0
 * @Title: securityMetadataSource
 * @Description : 该过滤器的主要作用就是通过spring著名的IoC生成securityMetadataSource。
 *                securityMetadataSource相当于本包中自定义的MyInvocationSecurityMetadataSourceService。
 *              该MyInvocationSecurityMetadataSourceService的作用提从数据库提取权限和资源，装配到HashMap中，
 *           供Spring Security使用，用于权限校验。
 * @date ：2018/4/18 12:03
 */

@Component
public class MySecurityFilter extends AbstractSecurityInterceptor implements Filter {

    @Autowired
    private MySecurityMetadataSourceService mySecurityMetadataSourceService;


    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MySecurityFilter.class);


    @Autowired
    public void setMyAccessDecisionManager(MyAccessDecisionManager myAccessDecisionManager) {
        super.setAccessDecisionManager(myAccessDecisionManager);
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("-------MySecurityFilter-------init------------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FilterInvocation fi = new FilterInvocation(request, response, chain);
        invoke(fi);
    }


    public void invoke(FilterInvocation fi) throws IOException, ServletException {
        //fi里面有一个被拦截的url
        //里面调用MyInvocationSecurityMetadataSource的getAttributes(Object object)这个方法获取fi对应的所有权限
        //再调用MyAccessDecisionManager的decide方法来校验用户的权限是否足够
        InterceptorStatusToken token = super.beforeInvocation(fi);
        try {
            //执行下一个拦截器
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } finally {
            super.afterInvocation(token, null);
        }
    }

    @Override
    public void destroy() {
        logger.info("-----MySecurityFilter---------destroy------------------");
    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return this.mySecurityMetadataSourceService;
    }
}

