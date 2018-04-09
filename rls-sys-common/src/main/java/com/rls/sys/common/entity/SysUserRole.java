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
 * @Title: 用户角色
 * @Description : ${todo}
 * @date ：2018/4/9 18:10
 */
@Entity
@Table(name = "rls_sys_user_role")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SysUserRole extends RBaseEntity implements Serializable {
}
