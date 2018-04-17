package com.rls.sys.common.dao;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.annotation.RImportant;
import com.rls.base.common.dao.RBaseRepository;
import com.rls.sys.common.entity.SysUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 用户dao
 * @Description : SysUser
 * @date ：2018/4/10 14:58
 */

@Repository
public interface SysUserRepository extends RBaseRepository<SysUser> {

    @RDescription("根据用户名查找用户信息")
    @RImportant
    @Query("from SysUser u where u.userName = ?1 and u.status = ?2")
    SysUser findByUserName(String userName, int status);
}
