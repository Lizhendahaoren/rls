package com.rls.sys.common.manager.impl;

import com.rls.sys.common.dao.SysRoleRepository;
import com.rls.sys.common.entity.SysResource;
import com.rls.sys.common.entity.SysRole;
import com.rls.sys.common.manager.SysResourceMng;
import com.rls.sys.common.manager.SysRoleMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysRoleMng
 * @Description : MngImpl
 * @date ：2018/4/10 15:08
 */
@Service
public class SysRoleMngImpl implements SysRoleMng {

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Override
    public SysRole selectOne(SysRole entity) {
        return null;
    }

    @Override
    public SysRole selectById(Long id) {
        return null;
    }

    @Override
    public List<SysRole> selectList(SysRole entity) {
        return null;
    }

    @Override
    public List<SysRole> selectListAll() {
        return sysRoleRepository.findAll();
    }

    @Override
    public Long selectCount(SysRole entity) {
        return null;
    }

    @Override
    public void insert(SysRole entity) {

    }

    @Override
    public void insertSelective(SysRole entity) {

    }

    @Override
    public void delete(SysRole entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysRole entity) {

    }

    @Override
    public void updateSelectiveById(SysRole entity) {

    }
}
