package com.xworkz.food.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("BeanConfiguration");
	}

}
