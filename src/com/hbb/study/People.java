package com.hbb.study;

public class People extends chinese {
    public int age;
    public String sex;

    public People() {

    }
    public People(int _age, String _sex) {
        age = _age;
        sex = _sex;
    }
}

class chinese {
    int height;
    public int getHeight() {
        return this.height;
    }
    chinese() {
        System.out.println("chinese构造函数");
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
