package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysRolePermission;
import com.rls.sys.common.manager.SysRolePermissionMng;
import com.rls.sys.common.service.service.SysRolePermissionService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRolePermissionService
 * @Description : SysRolePermissionServiceImpl
 * @date ：2018/4/10 15:32
 */
public class SysRolePermissionServiceImpl implements SysRolePermissionService {

    @Override
    public Optional<SysRolePermission> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysRolePermission object) {

    }

    @Override
    public void update(SysRolePermission object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysRolePermission> findALL(Map<String, Object> params) {
        return null;
    }
}
