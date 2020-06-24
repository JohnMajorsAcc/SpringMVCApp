package ru.johnmajor.myspring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};        //класс конфигурации спринг
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};                      // все запросы пользователя посылаются на dispatcher servlet
    }
}
