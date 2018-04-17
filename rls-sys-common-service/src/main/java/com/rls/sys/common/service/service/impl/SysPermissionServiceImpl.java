package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysPermission;
import com.rls.sys.common.manager.SysPermissionMng;
import com.rls.sys.common.service.service.SysPermissionService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysPermissionService
 * @Description : SysPermissionServiceImpl
 * @date ：2018/4/10 15:32
 */
public class SysPermissionServiceImpl implements SysPermissionService {

    @Override
    public Optional<SysPermission> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysPermission object) {

    }

    @Override
    public void update(SysPermission object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysPermission> findALL(Map<String, Object> params) {
        return null;
    }
}
