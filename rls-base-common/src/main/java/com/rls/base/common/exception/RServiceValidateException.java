package com.rls.base.common.exception;

import com.rls.base.common.annotation.RDescription;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title:  业务验证异常
 * @Description : ${todo}
 * @date ：2018/3/24 14:41
 */
public class RServiceValidateException extends  RuntimeException{


    @RDescription(value = "错误代码", description = "这里会使用错误常量")
    private Integer errorCode;

    public RServiceValidateException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public RServiceValidateException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}
