package com.rls.base.common.controller;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: BaseController
 * @Description : 定义捕获异常和返回数据
 * @date ：2018/3/24 14:10
 */
public class RBaseController {

    //优化返回数据封装


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
