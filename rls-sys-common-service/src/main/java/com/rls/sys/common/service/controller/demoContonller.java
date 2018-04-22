package com.rls.sys.common.service.controller;

import com.rls.base.common.constant.RConstant;
import com.rls.base.common.controller.RBaseController;
import com.rls.base.common.result.RBaseResult;
import com.rls.sys.common.constant.SysConstant;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: demo
 * @Description : 测试使用
 * @date ：2018/4/22 12:50
 */
@Api(value = "/demo",description = "模板实例")
@RestController
@RequestMapping("/demo")
public class demoContonller extends RBaseController<Object>{
    private Logger logger = LoggerFactory.getLogger(demoContonller.class);

    @ApiOperation(value="测试请求post", notes="测试请求post")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", value = "字符串a", required = true),
            @ApiImplicitParam(name = "b", value = "String B", required = true)
    })
    @PermitAll
    @PostMapping("textPost")
    public Object textPost(String a,  String b){
        logger.info("----------a----------------------:"+a);
        logger.info("----------b----------------------"+b);
        logger.info("----------textPost----------------------");
        return R(SysConstant.Status.ONE.getValue());
    }

    @ApiOperation(value="测试请求get", notes="测试请求get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", value = "字符串a", required = true),
            @ApiImplicitParam(name = "b", value = "String B", required = true)
    })
    @PermitAll
    @GetMapping("textGet")
    public Object textGet(String a, String b){
        logger.info("----------a----------------------:"+a);
        logger.info("----------b----------------------"+b);
        logger.info("----------textGet----------------------");
        return R(SysConstant.Status.ONE.getValue());
    }
}
