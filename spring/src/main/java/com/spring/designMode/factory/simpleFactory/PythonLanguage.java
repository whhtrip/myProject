package com.spring.designMode.factory.simpleFactory;

public class PythonLanguage implements Language {
    @Override
    public void getName() {
        System.out.println("I am Python Language!!!Hello");
    }
}
