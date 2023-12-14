package com.xworkz.toxic.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public ServletWebInit() {
		System.out.println("created ServletWebInit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("invoked getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("invoked getServletConfigClasses");
		return new Class[] { BeanConfigure.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("invoked getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
