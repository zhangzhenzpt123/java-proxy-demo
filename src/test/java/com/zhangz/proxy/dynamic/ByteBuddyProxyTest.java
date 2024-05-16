package com.zhangz.proxy.dynamic;

import org.junit.Test;

public class ByteBuddyProxyTest {
    @Test
    public void test() throws Exception {
        ByteBuddyProxy proxy = new ByteBuddyProxy(new Student("张三"));
        Person student = (Person) proxy.getProxy();
        student.wakeup();
        student.sleep();
    }
}
