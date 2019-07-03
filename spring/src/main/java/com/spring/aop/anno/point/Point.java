package com.spring.aop.anno.point;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * 只有置入spring工厂的bean才能被代理
 * IOC先将Bean置入工厂：在工厂中存在原型和代理对象，没设置原型则是代理对象
 * AOP从BeanFactory中得到Bean然后再置入通知：如果继承了接口则使用JDK，没有则使用Cglib
 *
 *
 */
@Service
public class Point {
    public void test01(){
        System.out.println("我会被前置");
    }
}
