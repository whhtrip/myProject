package com.spring.designMode.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        LanguageFactory languageFactory = new LanguageFactory();
        Language java = languageFactory.getLanguage("java");
        java.getName();
    }
}
