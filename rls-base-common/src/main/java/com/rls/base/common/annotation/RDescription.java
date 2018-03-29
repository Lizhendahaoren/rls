package com.rls.base.common.annotation;

import java.lang.annotation.*;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 提示注解   名称 + 描述
 * @Description : ${todo}
 * @date ：2018/3/29 16:39
 */
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
public @interface RDescription {
    String value() default "名称";
    String description() default "描述";
}
