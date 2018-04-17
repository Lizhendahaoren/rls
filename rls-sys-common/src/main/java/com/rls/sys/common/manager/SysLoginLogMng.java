package com.rls.sys.common.manager;


import com.rls.base.common.dao.RBaseRepository;
import com.rls.base.common.manager.RbaseManager;
import com.rls.sys.common.entity.SysLoginLog;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 登陆日志dao
 * @Description : SysApp
 * @date ：2018/4/9 22:42
 */
@Service
public interface SysLoginLogMng extends RbaseManager<SysLoginLog> {


}
