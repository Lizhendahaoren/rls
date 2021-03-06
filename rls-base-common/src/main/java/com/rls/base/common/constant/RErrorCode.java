package com.rls.base.common.constant;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 错误常量  业务 验证 转换
 * @Description : ${todo}
 * @date ：2018/3/29 12:00
 */
public class RErrorCode extends RConstant{

    public static enum ErrorCode {

        SUCCESS(0001, " 数据验证失败 "), AJAX_ERROR(0002, " 数据转换失败 ");

        private ErrorCode(Integer value, String message) {
            this.value = value;
            this.message = message;
        }

        private final Integer value;

        private final String message;

        public Integer getValue() {
            return value;
        }

        public String getMessage() {
            return message;
        }
    }

}
