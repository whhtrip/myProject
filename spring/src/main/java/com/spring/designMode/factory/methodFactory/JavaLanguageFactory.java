package com.spring.designMode.factory.methodFactory;

import com.spring.designMode.factory.simpleFactory.JavaLanguage;
import com.spring.designMode.factory.simpleFactory.Language;

public class JavaLanguageFactory implements LanguageFactory{

    @Override
    public Language getLanguage() {
        return new JavaLanguage();
    }
}
