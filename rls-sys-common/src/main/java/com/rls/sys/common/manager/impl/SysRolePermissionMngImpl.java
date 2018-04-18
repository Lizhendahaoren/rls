package com.rls.sys.common.manager.impl;

import com.rls.sys.common.entity.SysRolePermission;
import com.rls.sys.common.manager.SysRolePermissionMng;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRolePermissionMng
 * @Description : SysRolePermissionMngImpl
 * @date ：2018/4/10 15:32
 */
@Service
public class SysRolePermissionMngImpl implements SysRolePermissionMng{
    @Override
    public SysRolePermission selectOne(SysRolePermission entity) {
        return null;
    }

    @Override
    public SysRolePermission selectById(Long id) {
        return null;
    }

    @Override
    public List<SysRolePermission> selectList(SysRolePermission entity) {
        return null;
    }

    @Override
    public List<SysRolePermission> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysRolePermission entity) {
        return null;
    }

    @Override
    public void insert(SysRolePermission entity) {

    }

    @Override
    public void insertSelective(SysRolePermission entity) {

    }

    @Override
    public void delete(SysRolePermission entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysRolePermission entity) {

    }

    @Override
    public void updateSelectiveById(SysRolePermission entity) {

    }
}
