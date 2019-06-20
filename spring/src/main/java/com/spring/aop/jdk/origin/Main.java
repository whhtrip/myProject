package com.spring.aop.jdk.origin;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        JavaLanguage javaLanguage = new JavaLanguage();
        LanguangeInvocationHandler handler = new LanguangeInvocationHandler(javaLanguage);

        Language proxyLanguage = (Language) Proxy.newProxyInstance(javaLanguage.getClass().getClassLoader(), javaLanguage.getClass().getInterfaces(), handler);

        proxyLanguage.say();

    }
}
