package com.zhangz.proxy.dynamic;

public class PersonProxyTest {
    public static void main(String[] args) {
        Person person = new PersonProxy(new Student("张三"));
        person.wakeup();
        person.sleep();
    }
}
