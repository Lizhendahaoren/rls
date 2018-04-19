package com.rls.sys.common.service.config.security;


import com.google.common.collect.Lists;
import com.rls.sys.common.constant.SysConstant;
import com.rls.sys.common.entity.SysUser;
import com.rls.sys.common.manager.SysResourceMng;
import com.rls.sys.common.manager.SysUserMng;
import com.rls.sys.common.manager.SysUserRoleMng;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: UserDetailsService
 * @Description : 该类的主要作用是为Spring Security提供一个经过用户认证后的UserDetails UserDetails包括
 *                  UserDetails包括 用户名、密码、是否可用、是否过期等信息
 * @date ：2018/4/16 19:37
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserMng sysUserMng;

    @Autowired
    private SysUserRoleMng sysUserRoleMng;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        logger.info("-- 查询用户 · 权限的信息 --");
        // 返回的用户信息权限实体
        MyUserDetails myUserDetails = new MyUserDetails();
        // 根据userName查找用户信息
        try {
            SysUser user = sysUserMng.findByUserName(userName, SysConstant.Status.ONE.getValue());
            if(Objects.isNull(user)){// 没有这个用户直接返回
                 throw new UsernameNotFoundException("UserName " + userName + " not found");   //throw new Exception("登录失败：未找到用户信息");
            }
            // 存在这个用户时，找出该用户的权限
            List<String> rList = sysUserRoleMng.findRoleNameByUserName(userName);
            // 用户名密码
            myUserDetails.setUsername(user.getUserName());
            myUserDetails.setPassword(user.getPassWord());
            // 存放用户权限的信息
            List<GrantedAuthority> authorities = Lists.newArrayList();
            rList.stream().forEach(v->{// 接收一个表示权限的字符串
                GrantedAuthority authority = new SimpleGrantedAuthority(v);
                authorities.add(authority);
            });
            myUserDetails.setAuthorities(authorities);// 权限list的信息
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myUserDetails;
    }
}
