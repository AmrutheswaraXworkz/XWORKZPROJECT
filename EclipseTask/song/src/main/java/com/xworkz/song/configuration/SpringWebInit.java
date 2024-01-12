package com.xworkz.song.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	private int maxUploadSizeInMb=5*1024*1024;
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] { BeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] { "/" };
	}
	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		 File uploadDirectory = new File("D:\\spring-upload\\temp");

	        // register a MultipartConfigElement
	        MultipartConfigElement multipartConfigElement =
	                new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
	                        maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

	        registration.setMultipartConfig(multipartConfigElement);

	}

	
}
