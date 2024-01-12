package com.xworkz.details.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses is created");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses is created");
		return new Class[] {BeanConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings is created");
		return new String[] {"/"};
	}

}
