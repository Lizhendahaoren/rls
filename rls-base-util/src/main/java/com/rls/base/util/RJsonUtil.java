package com.rls.base.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rls.base.common.annotation.RDescription;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: fastjson
 * @Description : json 工具类
 * @date ：2018/4/17 11:22
 */
public class RJsonUtil {

    //Bean对象转JSON
    public static String toJson(Object object, String dataFormatString) {
        if (object != null) {
            if (RStringUtil.isEmpty(dataFormatString)) {
                return JSONObject.toJSONString(object);
            }
            return JSON.toJSONStringWithDateFormat(object, dataFormatString);
        } else {
            return null;
        }
    }

    // Bean对象转JSON
    public static String toJson(Object object) {
        if (object != null) {
            return JSON.toJSONString(object);
        } else {
            return null;
        }
    }

    // String转JSON字符串
    public static String stringToJsonByFastjson(String key, String value) {
        if (RStringUtil.isEmpty(key) || RStringUtil.isEmpty(value)) {
            return null;
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put(key, value);
        return toJson(map, null);
    }

    // 将json字符串转换成对象
    public static Object toBean(String json, Object clazz) {
        if (RStringUtil.isEmpty(json) || clazz == null) {
            return null;
        }
        return JSON.parseObject(json, clazz.getClass());
    }

    // json字符串转map
    @SuppressWarnings("unchecked")
    public static Map<String, Object> toMap(String json) {
        if (RStringUtil.isEmpty(json)) {
            return null;
        }
        return JSON.parseObject(json, Map.class);
    }

    // 转换为数组
    public static <T> Object[] toArray(String text) {
        return toArray(text, null);
    }

    // 转换为数组
    public static <T> Object[] toArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz).toArray();
    }

    // 转换为List
    public static <T> List<T> toList(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }


    public static void main(String[] args) {
        String a  = "[1,2,3,4]";
        List<Long> longs = toList(a, Long.class);
        longs.stream().forEach(v-> System.out.printf(":"+v));
    }
}
