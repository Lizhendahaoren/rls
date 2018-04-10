package com.rls.sys.common.dao;

import com.rls.base.common.dao.RBaseRepository;
import com.rls.sys.common.entity.SysApp;
import com.rls.sys.common.entity.SysPermission;
import org.springframework.stereotype.Repository;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 权限dao
 * @Description : SysPermission
 * @date ：2018/4/10 14:57
 */
@Repository
public interface SysPermissionRepository extends RBaseRepository<SysPermission> {
}
