package com.study.DailyClass;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(10);
        String c = b.toString();
        Integer d = Integer.parseInt("12");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("========");
        StringB objB = new StringB();
        objB.printData();


    }
}

class StringB {
    char a = 'a';
    {
        System.out.println(a);
    }
    public void printData() {
        StringBuilder i = new StringBuilder();
        StringBuilder x = new StringBuilder();

        System.out.println("i=" + i);

        for (int j = 0; j < 6; j++) {
            i = i.append((char)('a' + j));
            x = x.append('a' + j);
        }
        System.out.println("i==" + i);
        System.out.println("i===" + i.toString());
        System.out.println("x==" + x);
        System.out.println("x===" + x.toString());

    }



}
