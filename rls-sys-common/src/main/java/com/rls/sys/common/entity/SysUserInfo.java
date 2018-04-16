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
 * @Title: 用户信息
 * @Description : ${todo}
 * @date ：2018/4/9 18:07
 */
@Entity
@Table(name = "rls_sys_user_info")
public class SysUserInfo extends RBaseEntity implements java.io.Serializable{

    @org.hibernate.validator.constraints.Length(min = 0, max = 10, message = "姓名长度不能大于10")
    private String name;

    @org.hibernate.validator.constraints.Length(min = 0, max = 11, message = "手机号长度不能大于11")
    private String phone;

    @org.hibernate.validator.constraints.Length(min = 0, max = 50, message = "email长度不能大于50")
    private String email;

    @org.hibernate.validator.constraints.Length(min = 0, max = 30, message = "微信长度不能大于30")
    private String weichat;

    @org.hibernate.validator.constraints.Length(min = 0, max = 15, message = "qq长度不能大于15")
    private String qqNum;

    @Column(name = "name", length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "phone", length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email", length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "weichat", length = 30)
    public String getWeichat() {
        return weichat;
    }

    public void setWeichat(String weichat) {
        this.weichat = weichat;
    }

    @Column(name = "qqNum", length = 15)
    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }
}
