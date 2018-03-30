package com.rls.sys.common.service.controller;

import com.rls.sys.common.service.service.RBaseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: BaseController
 * @Description : 定义捕获异常和返回数据
 * @date ：2018/3/24 14:10
 */
public class RBaseController extends com.rls.base.common.controller.RBaseController {

    private RBaseService baseService;

}
