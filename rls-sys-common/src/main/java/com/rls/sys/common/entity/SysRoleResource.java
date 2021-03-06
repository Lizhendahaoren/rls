package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 角色权限
 * @Description : ${todo}
 * @date ：2018/4/9 18:11
 */
@Entity
@Table(name = "rls_sys_role_resource")
public class SysRoleResource extends RBaseEntity implements Serializable {

    @NotNull(message = "角色id不能为空")
    private Long sysRoleId;

    @NotNull(message = "资源id不能为空")
    private Long sysResourceId;

    @Column(name = "sysRoleId")
    public Long getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    @Column(name = "sysResourceId")
    public Long getSysResourceId() {
        return sysResourceId;
    }

    public void setSysResourceId(Long sysResourceId) {
        this.sysResourceId = sysResourceId;
    }
}
