package com.spring.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 声明切面
 */
@Aspect
@Component
public class Acpect {
    //定义切点
    @Pointcut("execution(public * com.spring.aop.anno..*.*(..))")
    public void pointCut() {
    }
    //前置增强
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("我是前面的");
    }
}
