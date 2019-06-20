package com.spring.aop.cglib.origin;

import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import org.springframework.cglib.proxy.Enhancer;

public class Factory {
    public static JavaLanguage getInstance(LanguageCglib language){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(JavaLanguage.class);
        enhancer.setCallback(language);
        JavaLanguage javaLanguage = (JavaLanguage) enhancer.create();
        return javaLanguage;
    }
}
