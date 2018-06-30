package com.rls.base.util;

import com.rls.base.common.constant.RConstant;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: object util
 * @Description : 提高对object处理 ： 类型/数组转换 ； 验证是否为nill；是否相同
 * @date ：2018/4/12 16:48
 */
public class RObjectUtil<T> {

    public RObjectUtil() {
    }

    // -----------做判断   统一返回boolean-----------------------

    /**
     * @param object1 object2
     * @return boolean 同true 否 false
     * @Description: 比较两个对象是否相同
     * @author :lz
     * @date :2018.6.26
     */
    public static boolean equals(@NotNull Object object1, @NotNull Object object2) {
        if (object1 == object2) {
            return true;
        } else {
            return object1 != null && object2 != null ? object1.equals(object2) : false;
        }
    }

    /**
     * @param Object arr1,  Object arr2
     * @return boolean
     * @Description: 验证两个数组是否相同  /   org.springframework.util.ObjectUtils.arrayEquals
     * 详情请查看源码  -->Arrays.deepEquals0
     * 1. 先比较引用
     * 2. arr1   arr2   ---->  arr1[0] == arr2[0]   arr1[1] == arr2[1] .....
     * @author :lz
     * @date : 2018/6/26 16:48
     */
    public static boolean equalDeep(@NotNull Object arr1, @NotNull Object arr2) {
        return Objects.deepEquals(arr1, arr2);
    }

    public static boolean notEqual(final Object object1, final Object object2) {
        return equals(object1, object2) == false;
    }

    public static boolean isNull(Object object1) {
        return Objects.isNull(object1);
    }

    public static boolean isNotNull(Object obj) {
        return Objects.nonNull(obj);
    }

    public static boolean isEmpty(Optional<?> op) {
        return op == null || !op.isPresent();
    }

    public static boolean isNotEmpty(Optional<?> op) {
        return op != null && op.isPresent();
    }

    public static boolean isArray(@Nullable Object obj) {
        return (obj != null && obj.getClass().isArray());
    }

    public static boolean isString(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof String)) return canCast(String.class, obj);
        return false;
    }

    public static boolean isLong(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Long)) return canCast(Long.class, obj);
        return false;
    }

    public static boolean isInteger(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Integer)) return canCast(Integer.class, obj);
        return false;
    }

    public static boolean isByte(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Byte)) return canCast(Byte.class, obj);
        return false;
    }

    public static boolean isShort(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Short)) return canCast(Short.class, obj);
        return RConstant.TrueOrFalse.FALSE.isValue();
    }

    public static boolean isBoolean(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Boolean)) return canCast(Boolean.class, obj);
        return RConstant.TrueOrFalse.FALSE.isValue();
    }

    public static boolean isDouble(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Double)) return canCast(Double.class, obj);
        return false;
    }

    public static boolean isFloat(@Nullable Object obj) {
        if (isNotNull(obj) && (obj instanceof Float)) return canCast(Float.class, obj);
        return false;
    }

    public static boolean isDate(Object obj) {
        if (isNotNull(obj) && (obj instanceof Date)) return canCast(Date.class, obj);
        return false;
    }

    public static boolean isBigDecimal(Object obj) {
        if (isNotNull(obj) && (obj instanceof BigDecimal)) return canCast(BigDecimal.class, obj);
        return false;
    }

    /**
     * @param Class<?> clazz, Object object
     * @return boolean
     * @Description: 能否转换
     * @author :lz
     * @date : 2018/6/26 16:48
     */
    public static boolean canCast(Class<?> clazz, Object object) {
        if (isNotNull(object)) return Optional.of(object).filter(clazz::isInstance).isPresent();
        return false;
    }

    //----------------------其他操作------------------------------------

    /**
     * @param Map<String, Object> map, Class<?> beanClass
     * @return Object
     * @Description: map --> object commons.BeanUtils
     * http://www.cnblogs.com/gyjx2016/p/6078210.html-- 三种方式
     * @author :lz
     * @date : 2018/6/26 16:48
     */
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (isNull(map)) return null;
        Object obj = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);
        return obj;
    }

    public static Map<?, ?> toMap(Object obj) {
        if (obj == null) return null;
        return new org.apache.commons.beanutils.BeanMap(obj);
    }

    //object --> Object array
    public static Object[] toObjectArray(@Nullable Object source) {
        if (isArray(source)) return new Object[0];
        return org.springframework.util.ObjectUtils.toObjectArray(source);
    }

    /**
     * @param target source
     * @return Object
     * @Description: 对象克隆
     * 转换成功-->true ;失败 --> false     使用BeanUtils工具
     * @author :lz
     * @date : 2018/6/26 16:48
     */
    public static boolean copyProperties(Object target, Object source) {
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(target, source);
        } catch (IllegalAccessException e) {
            return true;
        } catch (InvocationTargetException e) {
            return true;
        }
        return true;
    }

    public static Object cloneBean(@NotNull final Object bean) {
        if (isNull(bean)) return null;
        Object obj = null;
        try {
            obj = BeanUtilsBean.getInstance().cloneBean(bean);
        } catch (IllegalAccessException e) {
            return null;
        } catch (InstantiationException e) {
            return null;
        } catch (InvocationTargetException e) {
            return null;
        } catch (NoSuchMethodException e) {
            return null;
        }
        return obj;
    }


    //man
    public static void main(String[] args) {
        boolean date = isDate(new  Date());

        LocalDateTime now = LocalDateTime.now();
        Date a = new Date();
        System.out.print("a:"+a);
        System.out.printf("now:"+now);
    }

}
