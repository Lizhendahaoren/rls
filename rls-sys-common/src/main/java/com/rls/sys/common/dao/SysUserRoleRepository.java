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
    @Query(value = "select r.role_name from rls_sys_user_role ur left join  rls_sys_user u  on ur.sys_user_id = u.id "
            + " left join rls_sys_role r  on ur.sys_role_id = r.id  where  u.user_name = ?1", nativeQuery = true)
    List<String> findRoleNameByUserName(String userName);
}
