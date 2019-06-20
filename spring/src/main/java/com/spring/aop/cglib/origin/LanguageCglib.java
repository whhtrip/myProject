package com.spring.aop.cglib.origin;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LanguageCglib implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib Begin>>>>>>>>>>>>>>>>>>>>>>>>");
        methodProxy.invokeSuper(o,objects);
        System.out.println("Cglib end <<<<<<<<<<<<<<<<<<<<<<<<<");
        return null;
    }
}
