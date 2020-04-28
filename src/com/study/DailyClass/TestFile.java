package com.study.DailyClass;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("/Users/houbeibei/hht");
        System.out.println(f.getName());
        System.out.println(f.listFiles());

        File[] fList = f.listFiles();
        for (File item : fList) {
            System.out.println(item.getName());
        }

    }
}
