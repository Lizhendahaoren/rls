package com.rls.sys.common.dao;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.annotation.RImportant;
import com.rls.base.common.dao.RBaseRepository;
import com.rls.sys.common.entity.SysUserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 用户角色dao
 * @Description : SysUserRole
 * @date ：2018/4/10 14:58
 */

@Repository
public interface SysUserRoleRepository extends RBaseRepository<SysUserRole> {

    @RImportant
    @RDescription("根据用户名查找角色名")
    @Query("from ")
    List<String> findRoleNameByUserName(String userName);
}
