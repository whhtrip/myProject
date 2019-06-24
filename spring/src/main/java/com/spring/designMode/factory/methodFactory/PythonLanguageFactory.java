package com.spring.designMode.factory.methodFactory;

import com.spring.designMode.factory.simpleFactory.Language;
import com.spring.designMode.factory.simpleFactory.PythonLanguage;

public class PythonLanguageFactory implements LanguageFactory {
    @Override
    public Language getLanguage() {
        return new PythonLanguage();
    }
}
