package com.rls.sys.common.manager.impl;

import com.rls.sys.common.dao.SysAppRepository;
import com.rls.sys.common.entity.SysApp;
import com.rls.sys.common.manager.SysAppMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysAppMng
 * @Description : SysAppMngImpl
 * @date ：2018/4/10 15:32
 */
@Service
public class SysAppMngImpl implements SysAppMng {

    @Autowired
    private SysAppRepository sysAppRepository;

    @Override
    public SysApp selectOne(SysApp entity) {
        return null;
    }

    @Override
    public SysApp selectById(Long id) {
        return sysAppRepository.findById(id).isPresent() ? null : sysAppRepository.findById(id).get();
    }

    @Override
    public List<SysApp> selectList(SysApp entity) {
        return null;
    }

    @Override
    public List<SysApp> selectListAll() {
        return null;
    }

    @Override
    public Long selectCount(SysApp entity) {
        return null;
    }

    @Override
    public void insert(SysApp entity) {

    }

    @Override
    public void insertSelective(SysApp entity) {

    }

    @Override
    public void delete(SysApp entity) {

    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public void updateById(SysApp entity) {

    }

    @Override
    public void updateSelectiveById(SysApp entity) {

    }
}
