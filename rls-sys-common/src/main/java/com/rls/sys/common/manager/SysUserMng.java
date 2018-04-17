package com.rls.sys.common.manager;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysUser;
import org.springframework.stereotype.Service;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: ${file_name}
 * @Description : ${todo}
 * @date ：2018/4/10 15:12
 */
@Service
public interface SysUserMng extends RbaseManager<SysUser> {

    @RDescription("根据用户名查找用户信息")
    SysUser findByUserName(String userName, int status);
}
