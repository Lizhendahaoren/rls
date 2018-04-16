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
 * @Title: 用户角色
 * @Description : ${todo}
 * @date ：2018/4/9 18:10
 */
@Entity
@Table(name = "rls_sys_user_role")
public class SysUserRole extends RBaseEntity implements Serializable {

    @NotNull(message = "用户id不能为空")
    private Long sysUserId;

    @NotNull(message = "角色id不能为空")
    private Long sysRoleId;

    @Column(name = "sysUserId")
    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    @Column(name = "sysRoleId")
    public Long getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}
