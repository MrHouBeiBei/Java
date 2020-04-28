package com.study.container;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCollection {
    public static void main(String[] args) {
        testC<String> tester = new testC<String>();
        tester.set(0, "测试");
        tester.set(1, "测试测试");
        System.out.println(tester.get(0));
        System.out.println(tester.get(1));
        System.out.println(tester.get(2));

        System.out.println(Arrays.toString(tester.objList));
    }
}

class testC<E> {
    Object[] objList = new Object[5];
    public E get(int index) {
        return (E)objList[index];
    }
    public void set(int index, E val) {
        objList[index] = val;
    }
}
