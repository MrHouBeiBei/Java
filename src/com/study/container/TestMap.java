package com.study.container;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        //  HashMap
        Map<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(0, "测试");
        m1.put(1, "贤惠");
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.containsKey(1));

    }
}
