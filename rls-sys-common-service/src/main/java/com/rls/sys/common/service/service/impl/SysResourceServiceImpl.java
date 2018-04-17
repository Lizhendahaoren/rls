package com.rls.sys.common.service.service.impl;


import com.rls.sys.common.entity.SysResource;
import com.rls.sys.common.manager.SysResourceMng;
import com.rls.sys.common.service.service.SysResourceService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysResourceService
 * @Description : SysResourceServiceImpl
 * @date ：2018/4/9 22:42
 */
@Repository
public class SysResourceServiceImpl implements SysResourceService {


    @Override
    public Optional<SysResource> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysResource object) {

    }

    @Override
    public void update(SysResource object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysResource> findALL(Map<String, Object> params) {
        return null;
    }
}
