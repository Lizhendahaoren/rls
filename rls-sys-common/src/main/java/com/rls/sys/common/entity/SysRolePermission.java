package com.rls.sys.common.entity;

import com.rls.base.common.entity.RBaseEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 角色权限
 * @Description : ${todo}
 * @date ：2018/4/9 18:11
 */
@Entity
@Table(name = "rls_sys_permission")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SysRolePermission extends RBaseEntity implements Serializable {
}
