package com.spring.aop.jdk.origin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LanguangeInvocationHandler implements InvocationHandler {

    private Object target;

    public LanguangeInvocationHandler(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invocation====begin=====");
        method.invoke(target,args);
        System.out.println("Invocation====end=====");
        return null;
    }
}
