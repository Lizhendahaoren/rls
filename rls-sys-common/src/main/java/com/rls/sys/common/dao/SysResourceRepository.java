package com.rls.sys.common.dao;


import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.annotation.RImportant;
import com.rls.base.common.dao.RBaseRepository;
import com.rls.sys.common.entity.SysApp;
import com.rls.sys.common.entity.SysResource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 资源dao
 * @Description : SysApp
 * @date ：2018/4/9 22:42
 */
@Repository
public interface SysResourceRepository extends RBaseRepository<SysResource>{

    @RDescription("根据角色id查询资源list")
    @RImportant
    @Query("from SysResource rs left join SysRoleResource srr on srr.sysResourceId = rs.id where  srr.sysRoleId = ?1")
    List<SysResource> selectListByRoleId(Long roleId);
}
