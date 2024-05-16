package com.zhangz.proxy.dynamic;

import org.junit.Test;

public class JavassitProxyTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        JavassitProxy proxy = new JavassitProxy(new Student("张三"));
        Person student = (Person) proxy.getProxy();
        student.wakeup();
        student.sleep();
    }
}
