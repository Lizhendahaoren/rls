package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.dao.SysAppRepository;
import com.rls.sys.common.entity.SysApp;
import com.rls.sys.common.manager.SysAppMng;
import com.rls.sys.common.service.service.SysAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysAppService
 * @Description : SysAppServiceImpl
 * @date ：2018/4/10 15:32
 */
public class SysAppServiceImpl implements SysAppService {


    @Override
    public Optional<SysApp> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysApp object) {

    }

    @Override
    public void update(SysApp object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysApp> findALL(Map<String, Object> params) {
        return null;
    }
}
