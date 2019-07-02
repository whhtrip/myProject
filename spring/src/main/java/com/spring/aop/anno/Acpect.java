package com.spring.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class Acpect {
//    @Pointcut("execution(public * com.spring.aop.anno.point..*.*(..))")
    public void pointCut(){}

  //  @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("我是前面的");
    }
}
