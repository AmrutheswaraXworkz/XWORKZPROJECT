package com.xworkz.kanthara.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.kanthara")
public class SpringConfigure {

	public SpringConfigure() {
		System.out.println("created SpringConfigure");
	}
	@Bean
	public void beanMethod() {
		System.out.println("invoked bean method using @Bean");
	}
}
