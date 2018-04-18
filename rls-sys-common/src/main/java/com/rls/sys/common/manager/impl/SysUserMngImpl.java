package com.rls.sys.common.manager.impl;

import com.rls.sys.common.dao.SysUserRepository;
import com.rls.sys.common.entity.SysUser;
import com.rls.sys.common.manager.SysUserMng;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserMng
 * @Description : SysUserMngImpl
 * @date ：2018/4/10 15:33
 */
@Service
public class SysUserMngImpl implements SysUserMng {

    @Autowired
    private SysUserRepository sysUserRepository;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SysUserMngImpl.class);


    @Override
    public SysUser selectOne(SysUser entity) {
        return null;
    }

    @Override
    public SysUser selectById(Long id) {
        return null;
    }

    @Override
    public List<SysUser> selectList(SysUser entity) {
        return null;
    }

    @Override
    public List<SysUser> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysUser entity) {
        return null;
    }

    @Override
    public void insert(SysUser entity) {

    }

    @Override
    public void insertSelective(SysUser entity) {

    }

    @Override
    public void delete(SysUser entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysUser entity) {

    }

    @Override
    public void updateSelectiveById(SysUser entity) {

    }

    @Override
    public SysUser findByUserName(String userName, Integer status) {
        return sysUserRepository.findByUserName(userName, status);
    }
}
