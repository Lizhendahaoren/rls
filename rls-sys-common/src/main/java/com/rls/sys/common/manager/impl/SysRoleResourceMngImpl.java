package com.rls.sys.common.manager.impl;

import com.rls.sys.common.entity.SysRoleResource;
import com.rls.sys.common.manager.SysRoleResourceMng;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRoleResourceMng
 * @Description : SysRoleResourceMngImpl
 * @date ：2018/4/10 15:32
 */
@Service
public class SysRoleResourceMngImpl implements SysRoleResourceMng {
    @Override
    public SysRoleResource selectOne(SysRoleResource entity) {
        return null;
    }

    @Override
    public SysRoleResource selectById(Long id) {
        return null;
    }

    @Override
    public List<SysRoleResource> selectList(SysRoleResource entity) {
        return null;
    }

    @Override
    public List<SysRoleResource> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysRoleResource entity) {
        return null;
    }

    @Override
    public void insert(SysRoleResource entity) {

    }

    @Override
    public void insertSelective(SysRoleResource entity) {

    }

    @Override
    public void delete(SysRoleResource entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysRoleResource entity) {

    }

    @Override
    public void updateSelectiveById(SysRoleResource entity) {

    }
}
