package com.rls.sys.common.manager.impl;

import com.rls.sys.common.dao.SysUserRoleRepository;
import com.rls.sys.common.entity.SysUserRole;
import com.rls.sys.common.manager.SysUserRoleMng;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserRoleMng
 * @Description : SysUserRoleMngImpl
 * @date ：2018/4/10 15:33
 */
public class SysUserRoleMngImpl implements SysUserRoleMng {

    @Autowired
    private SysUserRoleRepository sysUserRoleRepository;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SysUserRoleMngImpl.class);

    @Override
    public SysUserRole selectOne(SysUserRole entity) {
        return null;
    }

    @Override
    public SysUserRole selectById(Long id) {
        return null;
    }

    @Override
    public List<SysUserRole> selectList(SysUserRole entity) {
        return null;
    }

    @Override
    public List<SysUserRole> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysUserRole entity) {
        return null;
    }

    @Override
    public void insert(SysUserRole entity) {

    }

    @Override
    public void insertSelective(SysUserRole entity) {

    }

    @Override
    public void delete(SysUserRole entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysUserRole entity) {

    }

    @Override
    public void updateSelectiveById(SysUserRole entity) {

    }

    @Override
    public List<String> findRoleNameByUserName(String userName) {
        return sysUserRoleRepository.findRoleNameByUserName(userName);
    }
}
