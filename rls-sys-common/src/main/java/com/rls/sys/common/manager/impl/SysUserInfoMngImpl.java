package com.rls.sys.common.manager.impl;

import com.rls.sys.common.entity.SysUserInfo;
import com.rls.sys.common.manager.SysUserInfoMng;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserInfoMng
 * @Description : SysUserInfoMngImpl
 * @date ：2018/4/10 15:33
 */
@Service
public class SysUserInfoMngImpl implements SysUserInfoMng{
    @Override
    public SysUserInfo selectOne(SysUserInfo entity) {
        return null;
    }

    @Override
    public SysUserInfo selectById(Long id) {
        return null;
    }

    @Override
    public List<SysUserInfo> selectList(SysUserInfo entity) {
        return null;
    }

    @Override
    public List<SysUserInfo> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysUserInfo entity) {
        return null;
    }

    @Override
    public void insert(SysUserInfo entity) {

    }

    @Override
    public void insertSelective(SysUserInfo entity) {

    }

    @Override
    public void delete(SysUserInfo entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysUserInfo entity) {

    }

    @Override
    public void updateSelectiveById(SysUserInfo entity) {

    }
}
