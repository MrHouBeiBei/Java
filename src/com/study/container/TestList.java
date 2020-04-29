package com.study.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        int[] a = new int[10];  //数组定义

        List<String> list = new ArrayList<String>();
        System.out.println(list);
        System.out.println(list.add("测试"));
        System.out.println(list.add("测试aa"));
        System.out.println(list);
        System.out.println();
        for (String item: list) {
            System.out.println("遍历 = "+item);
        }

        /**
         * Iterator
         */
        Iterator<String> iterator = list.iterator();
        if(iterator.hasNext()) {
            System.out.println(iterator.next());
            String aa = (String)iterator.next();  //默认返回Object
            System.out.println("aa = "+aa);
        }


    }
}
