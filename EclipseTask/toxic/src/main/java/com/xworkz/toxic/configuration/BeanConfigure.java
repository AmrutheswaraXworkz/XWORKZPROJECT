package com.xworkz.toxic.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.toxic")
public class BeanConfigure {
	public BeanConfigure() {
		System.out.println("created BeanConfigure");
	}

	
}
