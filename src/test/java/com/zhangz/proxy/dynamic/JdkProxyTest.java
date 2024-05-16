package com.zhangz.proxy.dynamic;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class JdkProxyTest {

    @Test
    public void test() {
        JdkProxy proxy = new JdkProxy(new Student("张三"));
        Person student = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        student.wakeup();
        student.sleep();
    }
}
