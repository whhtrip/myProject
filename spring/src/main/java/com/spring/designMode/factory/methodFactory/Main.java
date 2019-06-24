package com.spring.designMode.factory.methodFactory;

public class Main {
    public static void main(String[] args) {
        JavaLanguageFactory javaLanguageFactory = new JavaLanguageFactory();
        javaLanguageFactory.getLanguage().getName();
    }
}
