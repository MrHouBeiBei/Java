package com.study.DailyClass;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println("时间"+ now);

        Date date1 = new Date();
        System.out.println("date1= "+ date1);
        System.out.println(date1.equals(new Date(2019)));

        System.out.println(date1.after(new Date(2019)));


    }
}
