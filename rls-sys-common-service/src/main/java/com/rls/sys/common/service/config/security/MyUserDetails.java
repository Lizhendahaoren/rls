package com.rls.sys.common.service.config.security;

import java.util.List;

import com.rls.base.common.annotation.RDescription;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * @author ：lz
 * @version ： 1.0
 * @Title: UserDetails
 * @Description : 自定义 登陆用户信息
 * @date ：2018/4/16 20:42
 */
public class MyUserDetails implements UserDetails {

	@RDescription("当前用户角色信息")
	private List<GrantedAuthority> authorities;

	private String username;

	private String password;

	@RDescription("账户是否过期")
	private boolean accountNonExpired;

	@RDescription("是否锁定")
	private boolean accountNonLocked;

	@RDescription("认证是否过期")
	private boolean credentialsNonExpired;

	@RDescription("是不是激活的")
	private boolean enabled;


	/**
	 * 未处理字段-默认值
	 */
	public MyUserDetails() {
		accountNonExpired = true;
		accountNonLocked = true;
		credentialsNonExpired = true;
		enabled = true;

	}

	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

}
