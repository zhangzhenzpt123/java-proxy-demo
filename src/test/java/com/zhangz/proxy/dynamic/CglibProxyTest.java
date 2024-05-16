package com.zhangz.proxy.dynamic;

import org.junit.Test;

public class CglibProxyTest {
    @Test
    public void test() {
        CglibProxy proxy = new CglibProxy(new Student("张三"));
        Person student = (Student) proxy.getProxy();
        student.wakeup();
        student.sleep();
    }
}
