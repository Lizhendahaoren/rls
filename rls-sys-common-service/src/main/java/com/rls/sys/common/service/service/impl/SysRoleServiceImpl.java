package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysRole;
import com.rls.sys.common.manager.SysRoleMng;
import com.rls.sys.common.service.service.SysRoleService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRoleService
 * @Description : SysRoleServiceImpl
 * @date ：2018/4/10 15:08
 */
public class SysRoleServiceImpl implements SysRoleService {


    @Override
    public Optional<SysRole> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysRole object) {

    }

    @Override
    public void update(SysRole object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysRole> findALL(Map<String, Object> params) {
        return null;
    }
}
