package com.rls.base.common.constant;

import javax.lang.model.element.NestingKind;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 常量类
 * @Description : 常量定义
 * @date ：2018/3/24 11:15
 */
public class RConstant {

    /**
     * 常量
     * @author lz
     * @date 2018-3-24
     */
    public static enum Status {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

        private Status(Integer value) {
            this.value = value;
        }

        private final Integer value;

        public Integer getValue() {
            return value;
        }
    }

    /**
     * 审核状态
     *
     * @author lz
     * @date 2018-3-24
     */
    public static enum ReviewStatus {
        WAIT(1, "待审核"), AUDIT(2, "审核中"), PASS(3, "审核通过"), NOTPASS(4, "审核不通过");

        private ReviewStatus(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        private final Integer value;
        private final String name;

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * YES or NO
     * @author lz
     * @date 2018-3-24
     */
    public static enum YesOrNo {
        YES(1, "是", true), NO(0, "否", false);

        private final Integer value;
        private final String name;
        private final Boolean flag;

        private YesOrNo(Integer value, String name, Boolean flag) {
            this.value = value;
            this.name = name;
            this.flag = flag;

        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public Boolean getFlag() {
            return flag;
        }
    }

    /**
     * 性别
     *
     * @author lz
     * @date 2018-3-24
     */
    public static enum Sex {
        MAN("1", "男"), FEMAN("2", "女");

        private final String value;
        private final String name;

        private Sex(String value, String name) {
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


    //test run
    public static void main(String[] args) {

        Integer value = Status.ONE.getValue();
        System.out.println(value + ":" + value);

    }

}
