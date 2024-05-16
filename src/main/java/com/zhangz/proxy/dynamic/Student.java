package com.zhangz.proxy.dynamic;

public class Student implements Person{

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void wakeup() {
        System.out.println(String.format("学生[%s]早晨醒来啦",name));
    }

    @Override
    public void sleep() {
        System.out.println(String.format("学生[%s]晚上睡觉啦",name));
    }
}
