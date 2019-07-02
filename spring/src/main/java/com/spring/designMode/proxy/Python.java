package com.spring.designMode.proxy;

public class Python implements Proxy {
    @Override
    public void say() {
        System.out.println("I am Python");
    }
}
