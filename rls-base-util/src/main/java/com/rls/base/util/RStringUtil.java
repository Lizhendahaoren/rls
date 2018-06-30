package com.rls.base.util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: string
 * @Description : 提高字符串处理
 * @date ：2018/4/12 17:10
 */
public class RStringUtil{

    public static final String EMPTY = null;


    //-----------------判断------------------------------
    public static boolean hasText(String str)    {
        return StringUtils.hasText(str);
    }

    public static boolean hasNoText(String str)    {
        return !StringUtils.hasText(str);
    }

    public static boolean hasLength(String str)    {
        return StringUtils.hasLength(str);
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == EMPTY || cs.length() == 0;
    }

    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }

    public static boolean equals(final CharSequence cs1, final CharSequence cs2){
        return  org.apache.commons.lang3.StringUtils.equals(cs1.toString().trim(), cs2.toString().trim());
    }

    //------------------转换--------------------------------
    public static String trim(String str){
        if(isNotEmpty(str) && (str instanceof String)){
            String s = String.valueOf(str);
            if(isEmpty(s) || equals(EMPTY, s)){
                return  EMPTY;
            }
            return s;
        }
        return EMPTY;
    }

    /**
     * 字符串替换  源str  要替换 oldParams  替换成 newParams
     */
    public static String replaceAll(String str,String oldParams, String  newParams) {
        if(isEmpty(str)) return EMPTY;
        if(isEmpty(newParams)) return  str;
        if(isEmpty(oldParams)) return  newParams;
        String newStr = str.replaceAll(oldParams, newParams);
        return newStr;
    }

    /**
     * 判断字符串中是否包含中文
     * @param str
     * 待校验字符串
     * @return 是否为中文
     * @warn 不能校验是否为中文标点符号
     */
    public static boolean isContainChinese(String str) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    //是否是数字
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    //1,2,3  以逗号分隔字符串-->数组
    public static Long[] parseToLongArray(String str) {
        return Stream.of(str.split(",")).map(v -> Long.parseLong(v)).toArray(Long[]::new);
    }

    /**
     * 字符串数组中每个元素首字母大写
     */
    public static String[] toUpCaseFirst(String[] str) {
        if (str == null || str.length == 0) return str;
        String[] result= Stream.of(str).map(strx->toUpCaseFirst(strx)).toArray(String[]::new);
        return result;
    }

    /**
     * 字符串首字母大写
     */
    public static String toUpCaseFirst(String str) {
        if (str == null || "".equals(str))
            return str;
        String first = str.substring(0, 1).toUpperCase();
        String rest = str.substring(1, str.length());
        return new StringBuffer(first).append(rest).toString();
    }

    public static String toLowerCaseFirst(String str){
        if(str==null||str.length()==0) return str;
        String first = str.substring(0, 1).toLowerCase();
        String rest = str.substring(1, str.length());
        String newStr = new StringBuffer(first).append(rest).toString();
        return newStr;
    }

    public static void main(String[] args) {
        boolean s李镇 = isContainChinese("李镇");
        System.out.printf(""+s李镇);
    }

}
