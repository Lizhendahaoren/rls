package com.rls.sys.common.manager;


import com.rls.base.common.annotation.RDescription;
import com.rls.base.common.annotation.RImportant;
import com.rls.base.common.dao.RBaseRepository;
import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysResource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 资源dao
 * @Description : SysResource
 * @date ：2018/4/9 22:42
 */
@Service
public interface SysResourceMng extends RbaseManager<SysResource> {

}
