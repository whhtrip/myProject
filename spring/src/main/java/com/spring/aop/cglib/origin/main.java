package com.spring.aop.cglib.origin;

public class main {
    public static void main(String[] args) {
        LanguageCglib languageCglib = new LanguageCglib();
        JavaLanguage language = Factory.getInstance(languageCglib);
        language.say();
    }
}
