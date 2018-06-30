package com.rls.base.util;

import org.apache.commons.lang3.time.DateUtils;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 时间处理工具
 * @Description : date time
 * @date ：2018/4/17 14:12
 */
public class RDdteTimeUtil {


    //时间  Instant : 一是从原点开始到指定时间点的秒数s，二是距离该秒数s的纳秒数。  Duration对象表示两个时间点之间的距离
    private static boolean getTime(final Date date1, final Date date2) {

        Instant end = Instant.now();
        return DateUtils.isSameDay(date1, date2);
    }

    //----------------判断 + 比较-------------------------------------
    /**
     * 比较两个时间LocalDateTime大小
     *
     * @param time1
     * @param time2
     * @return 1:第一个比第二个大；0：第一个与第二个相同；-1：第一个比第二个小
     */
    public static int compareTwoTime(LocalDateTime time1, LocalDateTime time2) {
        if (time1.isAfter(time2)) {
            return 1;
        } else if (time1.isBefore(time2)) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * 判断当前时间是否在时间范围内
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public static boolean isTimeInRange(Date startTime, Date endTime) throws Exception {
        LocalDateTime now = getCurrentLocalDateTime();
        LocalDateTime start = dateToLocalDateTime(startTime);
        LocalDateTime end = dateToLocalDateTime(endTime);
        return (start.isBefore(now) && end.isAfter(now)) || start.isEqual(now) || end.isEqual(now);
    }

    //判断俩个时间是否相同
    private static boolean isSameDay(final Date date1, final Date date2) {
        return DateUtils.isSameDay(date1, date2);
    }

    /**
     * 比较两个LocalDateTime是否同一天
     *
     * @param begin
     * @param end
     * @return
     */
    public static boolean isTheSameDay(LocalDateTime begin, LocalDateTime end) {
        return begin.toLocalDate().equals(end.toLocalDate());
    }


    //---------------转换----------------------------------------------

    /**
     * Date 转 LocalDateTime
     *
     * @param date
     * @return LocalDateTime
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        long nanoOfSecond = (date.getTime() % 1000) * 1000000;
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(date.getTime() / 1000, (int) nanoOfSecond, ZoneOffset.of("+8"));
        return localDateTime;
    }

    /**
     * Timestamp 转 LocalDateTime
     *
     * @param date
     * @return LocalDateTime
     */
    public static LocalDateTime timestampToLocalDateTime(Timestamp date) {
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(date.getTime() / 1000, date.getNanos(), ZoneOffset.of("+8"));
        return localDateTime;
    }

    /**
     * Date 转 LocalDateTime
     *
     * @param date
     * @return LocalDate
     */
    public static LocalDate dateToLocalDate(Date date) {
        return dateToLocalDateTime(date).toLocalDate();
    }

    /**
     * timestamp 转 LocalDateTime
     *
     * @param date
     * @return LocalDate
     */
    public static LocalDate timestampToLocalDate(Timestamp date) {
        return timestampToLocalDateTime(date).toLocalDate();
    }


    /**
     * localDateTime 转 自定义格式string
     *
     * @param localDateTime
     * @param format        例：yyyy-MM-dd hh:mm:ss
     * @return
     */
    public static String formatLocalDateTimeToString(LocalDateTime localDateTime, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return localDateTime.format(formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String formatLocalDateToString(LocalDate localDate, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return localDate.format(formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String formatLocalTimeToString(LocalTime localTime, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return localTime.format(formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * string 转 LocalDateTime
     *
     * @param dateStr 例："2017-08-11 01:00:00"
     * @param format  例："yyyy-MM-dd HH:mm:ss"
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String dateStr, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return LocalDateTime.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static LocalDate stringToLocalDate(String dateStr, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static LocalTime stringToLocalTime(String dateStr, RDateStyle rDateStyle) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(rDateStyle.getValue());
            return LocalTime.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据时间获取当月有多少天数
     *
     * @param date
     * @return
     */
    public static int getActualMaximum(Date date) {
        return dateToLocalDateTime(date).getMonth().length(dateToLocalDate(date).isLeapYear());
    }

    /**
     * 根据日期获得星期
     *
     * @param date
     * @return 1:星期一；2:星期二；3:星期三；4:星期四；5:星期五；6:星期六；7:星期日；
     */
    public static int getWeekOfDate(Date date) {
        return dateToLocalDateTime(date).getDayOfWeek().getValue();
    }


    /**
     * 计算两个日期LocalDate相差的天数，不考虑日期前后，返回结果>=0
     *
     * @param before
     * @param after
     * @return
     */
    public static int getAbsDateDiffDay(LocalDate before, LocalDate after) {
        return Math.abs(Period.between(before, after).getDays());
    }

    /**
     * 计算两个时间LocalDateTime相差的天数，不考虑日期前后，返回结果>=0
     *
     * @param before
     * @param after
     * @return
     */
    public static int getAbsTimeDiffDay(LocalDateTime before, LocalDateTime after) {
        return Math.abs(Period.between(before.toLocalDate(), after.toLocalDate()).getDays());
    }

    /**
     * 计算两个时间LocalDateTime相差的月数，不考虑日期前后，返回结果>=0
     *
     * @param before
     * @param after
     * @return
     */
    public static int getAbsTimeDiffMonth(LocalDateTime before, LocalDateTime after) {
        return Math.abs(Period.between(before.toLocalDate(), after.toLocalDate()).getMonths());
    }

    /**
     * 计算两个时间LocalDateTime相差的年数，不考虑日期前后，返回结果>=0
     *
     * @param before
     * @param after
     * @return
     */
    public static int getAbsTimeDiffYear(LocalDateTime before, LocalDateTime after) {
        return Math.abs(Period.between(before.toLocalDate(), after.toLocalDate()).getYears());
    }

    /**
     * 根据传入日期返回星期几
     *
     * @param date 日期
     * @return 1-7 1：星期天,2:星期一,3:星期二,4:星期三,5:星期四,6:星期五,7:星期六
     */
    public static int getDayOfWeek(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 获取当前时间
     *
     * @return LocalDateTime
     */
    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai")));
    }


    //------------格式+ 星期  enum-------------------------------------
    //时间格式
    public static enum RDateStyle {

        YYYY("yyyy", "年"),
        MM("MM", "月"),
        DD("DD", "日"),
        HH("HH", "时"),
        mm("mm", "分"),
        ss("ss", "秒"),

        HH_MM("HH:mm"),
        HH_MM_SS("HH:mm:ss"),

        MM_DD("MM-dd"),
        YYYY_MM("yyyy-MM"),
        YYYY_MM_DD("yyyy-MM-dd"),
        MM_DD_HH_mm("MM-dd HH:mm"),
        MM_DD_HH_mm_ss("MM-dd HH:mm:ss"),
        YYYY_MM_DD_HH_mm("yyyy-MM-dd HH:mm"),
        YYYY_MM_DD_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),

        MM_DD_EN("MM/dd"),
        YYYY_MM_EN("yyyy/MM"),
        YYYY_MM_DD_EN("yyyy/MM/dd"),
        MM_DD_HH_MM_EN("MM/dd HH:mm"),
        MM_DD_HH_MM_SS_EN("MM/dd HH:mm:ss"),
        YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm"),
        YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss"),

        MM_DD_CN("MM月dd日"),
        YYYY_MM_CN("yyyy年MM月"),
        YYYY_MM_DD_CN("yyyy年MM月dd日"),
        MM_DD_HH_MM_CN("MM月dd日 HH:mm"),
        MM_DD_HH_MM_SS_CN("MM月dd日 HH:mm:ss"),
        YYYY_MM_DD_HH_MM_CN("yyyy年MM月dd日 HH:mm"),
        YYYY_MM_DD_HH_MM_SS_CN("yyyy年MM月dd日 HH:mm:ss"),;
        private String value;

        private String name;

        private RDateStyle(String value) {
            this.value = value;
        }

        private RDateStyle(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

    }

    //
    public static enum RDateWeek {
        MONDAY("星期一", "Monday", "Mon.", 1),
        TUESDAY("星期二", "Tuesday", "Tues.", 2),
        WEDNESDAY("星期三", "Wednesday", "Wed.", 3),
        THURSDAY("星期四", "Thursday", "Thur.", 4),
        FRIDAY("星期五", "Friday", "Fri.", 5),
        SATURDAY("星期六", "Saturday", "Sat.", 6),
        SUNDAY("星期日", "Sunday", "Sun.", 7);

        String name_cn;
        String name_en;
        String name_enShort;
        int number;

        private RDateWeek(String name_cn, String name_en, String name_enShort, int number) {
            this.name_cn = name_cn;
            this.name_en = name_en;
            this.name_enShort = name_enShort;
            this.number = number;
        }

        public String getChineseName() {
            return name_cn;
        }

        public String getName() {
            return name_en;
        }

        public String getShortName() {
            return name_enShort;
        }

        public int getNumber() {
            return number;
        }
    }

}
