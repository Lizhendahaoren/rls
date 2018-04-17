package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysUserRole;
import com.rls.sys.common.manager.SysUserRoleMng;
import com.rls.sys.common.service.service.SysUserRoleService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserRoleService
 * @Description : SysUserRoleServiceImpl
 * @date ：2018/4/10 15:33
 */
public class SysUserRoleServiceImpl implements SysUserRoleService {


    @Override
    public Optional<SysUserRole> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysUserRole object) {

    }

    @Override
    public void update(SysUserRole object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysUserRole> findALL(Map<String, Object> params) {
        return null;
    }
}
