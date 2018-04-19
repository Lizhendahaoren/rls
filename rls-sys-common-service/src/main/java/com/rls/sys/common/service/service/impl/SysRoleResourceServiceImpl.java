package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysRoleResource;
import com.rls.sys.common.service.service.SysRoleResourceService;
import org.springframework.data.domain.Page;

import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRoleResourceService
 * @Description : SysRoleResourceServiceImpl
 * @date ：2018/4/10 15:32
 */
public class SysRoleResourceServiceImpl implements SysRoleResourceService {

    @Override
    public Optional<SysRoleResource> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysRoleResource object) {

    }

    @Override
    public void update(SysRoleResource object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysRoleResource> findALL(Map<String, Object> params) {
        return null;
    }
}
