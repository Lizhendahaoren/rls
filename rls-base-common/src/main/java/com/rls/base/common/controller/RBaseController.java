package com.rls.base.common.controller;


import com.rls.base.common.result.RBaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author ：lz
 * @version ： 1.0
 * @Title: BaseController
 * @Description : 返回数据
 * @date ：2018/3/24 14:10
 */
public class RBaseController<T> {

    private static final Logger logger = LoggerFactory.getLogger(RBaseController.class);

    /**
     * 简化返回数据
     *   1.c +  m  +  d
     *    2. c + m
     *    3. c + d
     *     4. c
     */
    protected RBaseResult R(int statusCode, String message, Object data) {
        RBaseResult msg = new RBaseResult();
        msg.setCode(statusCode);
        msg.setMessage(message);
        msg.setData(data);
        return msg;
    }

    protected RBaseResult R(int statusCode, String message) {
        RBaseResult msg = new RBaseResult();
        msg.setCode(statusCode);
        msg.setMessage(message);
        return msg;
    }

    protected RBaseResult R(int statusCode, Object data) {
        RBaseResult msg = new RBaseResult();
        msg.setCode(statusCode);
        msg.setData(data);
        return msg;
    }
    protected RBaseResult R(int statusCode) {
        RBaseResult msg = new RBaseResult();
        msg.setCode(statusCode);
        return msg;
    }

    protected static final String viewPath="view";

    protected  Object forward(String viewPath,String viewName) {
        if(!viewPath.startsWith("/")){
            viewPath="/"+viewPath;
        }
        return "forward:"+viewPath+viewName;
    }

    protected Object redirect(String viewPath,String viewName) {
        if(!viewPath.startsWith("/")){
            viewPath="/"+viewPath;
        }
        return "redirect:"+viewPath+viewName;
    }

}
