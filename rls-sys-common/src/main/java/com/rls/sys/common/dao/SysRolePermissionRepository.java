package com.rls.sys.common.dao;

import com.rls.base.common.dao.RBaseRepository;
import com.rls.sys.common.entity.SysPermission;
import com.rls.sys.common.entity.SysRolePermission;
import org.springframework.stereotype.Repository;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 角色权限dao
 * @Description : SysRolePermission
 * @date ：2018/4/10 14:58
 */

@Repository
public interface SysRolePermissionRepository extends RBaseRepository<SysRolePermission> {
}
