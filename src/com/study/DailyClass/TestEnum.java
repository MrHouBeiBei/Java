package com.study.DailyClass;

/**
 * 枚举
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Week.values());
        for (Week item: Week.values()) {
            System.out.println(item);
        }
        System.out.println(Week.values()[0]);

    }
}

enum Week {
    星期一, 星期二, 星期三;
}
