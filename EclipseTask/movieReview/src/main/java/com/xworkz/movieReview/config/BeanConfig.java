package com.xworkz.movieReview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.movieReview")
public class BeanConfig {

	@Bean
	public ViewResolver view() {
		ViewResolver resolver=new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
}
