package com.spring.designMode.proxy;

import java.util.Random;

public class ProxyMain implements Proxy{
    @Override
    public void say() {
        System.out.println("委派开始执行");
        Proxy proxy = null;
        if (new Random().nextBoolean()){
            proxy = new Java();
        }else {
            proxy = new Python();
        }
        proxy.say();
        System.out.println("代理执行完毕");
    }
}
