package com;

import com.study.DailyClass.TestSDF;

import java.text.ParseException;

/**
 * 测试data ParseException
 */
public class TestDate {
    public static void main(String[] args) {
        TestSDF testSDF = new TestSDF();
        try {
            testSDF.SimpleDateFormat3();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
