package com.rls.base.common.result;

import java.io.Serializable;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 统一返回结果基类
 * @Description : ${todo}
 * @date ：2018/3/29 11:23
 */
public class RBaseResult implements Serializable {
    /**
     * 状态码：--状态码常量定义
     */
    public int code;

    /**
     * 成功为success，其他为失败原因
     */
    public String message;

    /**
     * 数据结果集
     */
    public Object data;

    public RBaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
