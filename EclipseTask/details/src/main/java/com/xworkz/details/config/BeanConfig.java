package com.xworkz.details.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.details")
@EnableWebMvc
public class BeanConfig {

	@Bean
	public ViewResolver resolver() {
		ViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
}
