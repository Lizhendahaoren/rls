package com.rls.sys.common.service.controller;

import com.rls.base.common.controller.RBaseController;
import com.rls.sys.common.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;


/**
 * @author ：lz
 * @version ： 1.0
 * @Title: SysUserController
 * @Description : SysUser
 * @date ：2018/4/10 15:33
 */
public class SysUserController extends RBaseController<SysUser> {

    private Logger logger = LoggerFactory.getLogger(SysUserController.class);


}
