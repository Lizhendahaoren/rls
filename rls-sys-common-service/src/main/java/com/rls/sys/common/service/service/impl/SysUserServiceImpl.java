package com.rls.sys.common.service.service.impl;

import com.rls.sys.common.dao.SysUserRepository;
import com.rls.sys.common.entity.SysUser;
import com.rls.sys.common.manager.SysUserMng;
import com.rls.sys.common.service.service.SysUserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserService
 * @Description : SysUserServiceImpl
 * @date ：2018/4/10 15:33
 */
public class SysUserServiceImpl implements SysUserService {


    @Override
    public Optional<SysUser> load(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(SysUser object) {

    }

    @Override
    public void update(SysUser object) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<SysUser> findALL(Map<String, Object> params) {
        return null;
    }
}
