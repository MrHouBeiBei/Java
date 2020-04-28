package com.study.DailyClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar();
        a.setTime(new Date());
        System.out.println(a);
        System.out.println(a.get(Calendar.YEAR));
        System.out.println(a.get(Calendar.DAY_OF_WEEK));

        a.set(Calendar.YEAR, 2021);
        System.out.println("=========");
        System.out.println(a.get(Calendar.YEAR));

        /**
         * 转为时间对象
         */
        System.out.println(a.getTime());




    }
}
