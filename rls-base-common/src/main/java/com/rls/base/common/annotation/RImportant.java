package com.rls.base.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 重要标记注解
 * @Description : 表示该方法/类/属性/ 有关键作用 请勿乱动
 * @date ：2018/3/29 16:39
 */
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
public @interface RImportant {
    String description() default "作用";
}
