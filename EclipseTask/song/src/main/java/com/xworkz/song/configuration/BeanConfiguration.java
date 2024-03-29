package com.xworkz.song.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.xworkz.song")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration");
	}
	
	@Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
	
	@Bean
	public ViewResolver resolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
}
