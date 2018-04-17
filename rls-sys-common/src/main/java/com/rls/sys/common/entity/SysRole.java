package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 角色
 * @Description : ${todo}
 * @date ：2018/4/9 18:08
 */
@Entity
@Table(name = "rls_sys_role")
public class SysRole extends RBaseEntity implements java.io.Serializable{

    @NotNull(message="角色id不能为空")
    private Long roleId;

    @org.hibernate.validator.constraints.Length(min = 0, max = 10, message = "角色名称长度不能大于10")
    @NotNull(message="角色名称不能为空")
    private String roleName;

    @org.hibernate.validator.constraints.Length(min = 0, max = 100, message = "角色描述长度不能大于100")
    private String roleDesc;

    @javax.validation.constraints.NotNull(message="所属应用不能为空")
    private Long appKeyId;

    @Column(name = "roleId", nullable = false)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "roleName", length = 10, nullable = false, unique = true)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Column(name = "roleDesc", length = 100)
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Column(name = "appKeyId", nullable = false)
    public Long getAppKeyId() {
        return appKeyId;
    }

    public void setAppKeyId(Long appKeyId) {
        this.appKeyId = appKeyId;
    }
}
