package com.rls.sys.common.manager.impl;

import com.rls.sys.common.entity.SysPermission;
import com.rls.sys.common.manager.SysPermissionMng;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysPermissionMng
 * @Description : SysPermissionMngImpl
 * @date ：2018/4/10 15:32
 */
@Service
public class SysPermissionMngImpl implements SysPermissionMng{
    @Override
    public SysPermission selectOne(SysPermission entity) {
        return null;
    }

    @Override
    public SysPermission selectById(Long id) {
        return null;
    }

    @Override
    public List<SysPermission> selectList(SysPermission entity) {
        return null;
    }

    @Override
    public List<SysPermission> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysPermission entity) {
        return null;
    }

    @Override
    public void insert(SysPermission entity) {

    }

    @Override
    public void insertSelective(SysPermission entity) {

    }

    @Override
    public void delete(SysPermission entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysPermission entity) {

    }

    @Override
    public void updateSelectiveById(SysPermission entity) {

    }
}
