package com.study.DailyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSDF {
    public static void main(String[] args) {
        SimpleDateFormat s1 = new SimpleDateFormat("D");//年中的天数
        String dayTime = s1.format(new Date());
        System.out.println(dayTime);

        SimpleDateFormat s2 = new SimpleDateFormat("d");//月中的天数
        System.out.println(s2.format(new Date()));

        /**
         * 捕获异常
         */
        try {
            String time = "10";
            System.out.println(s1.parse(time));
        }  catch (ParseException e) {
            e.printStackTrace();
        }


    }

    /**
     * 异常抛给上一级
     */
    public void SimpleDateFormat3() throws ParseException {
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd");
        String timeB = "2007-10-1";
        Date date = s3.parse(timeB);

        System.out.println("date=" + date);
    }
}
