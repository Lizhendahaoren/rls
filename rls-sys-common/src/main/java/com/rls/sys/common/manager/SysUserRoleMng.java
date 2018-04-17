package com.rls.sys.common.manager;

import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.annotation.RImportant;
import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysUserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: ${file_name}
 * @Description : ${todo}
 * @date ：2018/4/10 15:12
 */
@Service
public interface SysUserRoleMng extends RbaseManager<SysUserRole> {
    @RDescription("根据用户名查找角色名")
    @RImportant
    List<String> findRoleNameByUserName(String userName);
}
