package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.entity.SysUserInfo;
import com.rls.sys.common.manager.SysUserInfoMng;
import com.rls.sys.common.service.service.SysUserInfoService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserInfoService
 * @Description : SysUserInfoServiceImpl
 * @date ：2018/4/10 15:33
 */
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Override
    public Optional<SysUserInfo> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysUserInfo object) {

    }

    @Override
    public void update(SysUserInfo object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysUserInfo> findALL(Map<String, Object> params) {
        return null;
    }
}
