package com.spring.designMode.factory.simpleFactory;

public class LanguageFactory {
    public String name;
    public Language getLanguage(String languageName){
        if ("java".equals(languageName)){
            return new JavaLanguage();
        }
        if ("python".equals(languageName)){
            return new PythonLanguage();
        }
        return null;
    }
}
