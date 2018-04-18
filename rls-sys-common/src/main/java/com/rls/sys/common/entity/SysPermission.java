package com.rls.sys.common.entity;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 权限
 * @Description : ${todo}
 * @date ：2018/4/9 18:09
 */
@Entity
@Table(name = "rls_sys_permission")
public class SysPermission extends RBaseEntity implements Serializable {

    @javax.validation.constraints.NotBlank(message="权限编码不能为空")
    @org.hibernate.validator.constraints.Length(min=1,max=200,message="权限编码长度不能大于60字符")
    private java.lang.String permissionCode;

    @javax.validation.constraints.NotNull(message="所属应用不能为空")
    private java.lang.String appKeyId;

    @javax.validation.constraints.NotBlank(message="权限名称不能为空")
    @org.hibernate.validator.constraints.Length(min=1,max=40,message="权限名称长度不能大于40字符")
    private java.lang.String permissionName;

    @javax.validation.constraints.NotBlank(message="权限URL不能为空")
    @org.hibernate.validator.constraints.Length(min=1,max=255,message="权限URL长度不能大于255字符")
    private java.lang.String permissionUrl;

    @org.hibernate.validator.constraints.Length(min=1,max=50,message="权限描述不能超过50字符")
    private java.lang.String description;

    @Column(name = "permissionCode", length = 200, nullable = false, unique = true)
    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    @Column(name = "appKeyId", nullable = false)
    public String getAppKeyId() {
        return appKeyId;
    }

    public void setAppKeyId(String appKeyId) {
        this.appKeyId = appKeyId;
    }

    @Column(name = "permissionName", length = 40, nullable = false)
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Column(name = "permissionUrl", length = 255, nullable = false)
    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    @Column(name = "description", length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
