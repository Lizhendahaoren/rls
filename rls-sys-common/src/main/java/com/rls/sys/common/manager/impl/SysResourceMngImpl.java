package com.rls.sys.common.manager.impl;


import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysResource;
import com.rls.sys.common.manager.SysResourceMng;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 资源dao
 * @Description : SysApp
 * @date ：2018/4/9 22:42
 */
@Repository
public class SysResourceMngImpl implements SysResourceMng {


    @Override
    public SysResource selectOne(SysResource entity) {
        return null;
    }

    @Override
    public SysResource selectById(Long id) {
        return null;
    }

    @Override
    public List<SysResource> selectList(SysResource entity) {
        return null;
    }

    @Override
    public List<SysResource> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysResource entity) {
        return null;
    }

    @Override
    public void insert(SysResource entity) {

    }

    @Override
    public void insertSelective(SysResource entity) {

    }

    @Override
    public void delete(SysResource entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysResource entity) {

    }

    @Override
    public void updateSelectiveById(SysResource entity) {

    }

}
