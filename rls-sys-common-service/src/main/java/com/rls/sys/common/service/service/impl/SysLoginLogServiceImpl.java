package com.rls.sys.common.service.service.impl;


import com.rls.sys.common.entity.SysLoginLog;
import com.rls.sys.common.manager.SysLoginLogMng;
import com.rls.sys.common.service.service.SysLoginLogService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysLoginLogService
 * @Description : SysLoginLogServiceImpl
 * @date ：2018/4/9 22:42
 */
@Repository
public class SysLoginLogServiceImpl implements SysLoginLogService {


    @Override
    public Optional<SysLoginLog> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysLoginLog object) {

    }

    @Override
    public void update(SysLoginLog object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysLoginLog> findALL(Map<String, Object> params) {
        return null;
    }
}
