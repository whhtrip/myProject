package com.spring.aop.jdk.origin;

public class JavaLanguage implements Language {
    @Override
    public void say() {
        System.out.println("I am java，Hello World");
    }
}
