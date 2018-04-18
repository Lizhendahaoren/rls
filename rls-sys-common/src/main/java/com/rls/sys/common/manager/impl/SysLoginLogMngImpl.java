package com.rls.sys.common.manager.impl;


import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysLoginLog;
import com.rls.sys.common.manager.SysLoginLogMng;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 登陆日志dao
 * @Description : SysApp
 * @date ：2018/4/9 22:42
 */
@Service
public class SysLoginLogMngImpl implements SysLoginLogMng {


    @Override
    public SysLoginLog selectOne(SysLoginLog entity) {
        return null;
    }

    @Override
    public SysLoginLog selectById(Long id) {
        return null;
    }

    @Override
    public List<SysLoginLog> selectList(SysLoginLog entity) {
        return null;
    }

    @Override
    public List<SysLoginLog> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysLoginLog entity) {
        return null;
    }

    @Override
    public void insert(SysLoginLog entity) {

    }

    @Override
    public void insertSelective(SysLoginLog entity) {

    }

    @Override
    public void delete(SysLoginLog entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysLoginLog entity) {

    }

    @Override
    public void updateSelectiveById(SysLoginLog entity) {

    }
}
