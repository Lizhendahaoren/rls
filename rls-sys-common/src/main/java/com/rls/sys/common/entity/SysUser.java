package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 用户
 * @Description : ${todo}
 * @date ：2018/4/9 18:06
 */
@Entity
@Table(name = "rls_sys_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@MappedSuperclass
public class SysUser extends RBaseEntity implements java.io.Serializable{

    @javax.validation.constraints.NotNull(message = "用户名不能为空")
    @org.hibernate.validator.constraints.Length(min=0,max=15,message="用户名长度不能大于15")
    private String userName;

    @javax.validation.constraints.NotNull(message = "密码不能为空")
    @org.hibernate.validator.constraints.Length(min=0,max=30,message="密码长度不能大于30")
    private String passWord;

    @org.hibernate.validator.constraints.Length(min=0,max=60,message="加密盐值长度不能大于60")
    private java.lang.String salt;

    @org.hibernate.validator.constraints.Length(min=0,max=20,message="openId长度不能大20")
    private String openId;

    @javax.validation.constraints.NotNull(message = "默认角色不能为空")
    private java.lang.Long defaultRole;

    @org.hibernate.validator.constraints.Length(min = 0, max = 100, message = "描述长度不能大于100")
    private java.lang.String description;

    @Column(name = "userName", length = 15, nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", length = 30, nullable = false)
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Column(name = "salt", length = 60)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Column(name = "openId", length = 20)
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Column(name = "defaultRole", nullable = false)
    public Long getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(Long defaultRole) {
        this.defaultRole = defaultRole;
    }

    @Column(name = "description", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
