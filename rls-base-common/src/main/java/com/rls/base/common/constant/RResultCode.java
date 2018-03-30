package com.rls.base.common.constant;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 返回信息常量定义
 * @Description : ${todo}
 * @date ：2018/3/29 11:14
 */
public class RResultCode extends RConstant {


    //返回常量 code + message
    public static enum ResultCode {
        SUCCESS(200, " 数据处理成功 "), AJAX_ERROR(300, " 请求异常 "),
        INVALID_SESSIONUSER(301, " 连接超时 "), COMMIT_ERROR(303, " 重复提交 "),
        AUTH_ERROR(401, " 权限错误 "), SERVICE_RROE(500, "  服务器错误 "),
        QUERY_FAILURE(000, " 未查询到数据 ");

        private ResultCode(Integer value, String message) {
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
