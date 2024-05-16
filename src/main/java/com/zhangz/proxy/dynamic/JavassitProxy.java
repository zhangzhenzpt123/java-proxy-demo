package com.zhangz.proxy.dynamic;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;

import java.util.List;

public class JavassitProxy {

    private Object bean;

    public JavassitProxy(Object bean) {
        this.bean = bean;
    }

    public Object getProxy() throws IllegalAccessException, InstantiationException {
        ProxyFactory f = new ProxyFactory();
        f.setSuperclass(bean.getClass());
        f.setFilter(m -> List.of("wakeup","sleep").contains(m.getName()));

        Class c = f.createClass();
        MethodHandler mi = (self, method, proceed, args) -> {
            String methodName = method.getName();
            if (methodName.equals("wakeup")){
                System.out.println("早安~~~");
            }else if(methodName.equals("sleep")){
                System.out.println("晚安~~~");
            }
            return method.invoke(bean, args);
        };
        Object proxy = c.newInstance();
        ((Proxy)proxy).setHandler(mi);
        return proxy;
    }

}
