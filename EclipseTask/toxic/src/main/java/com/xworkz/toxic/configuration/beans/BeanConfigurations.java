package com.xworkz.toxic.configuration.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.toxic")
public class BeanConfigurations {
	public BeanConfigurations() {
		System.out.println("created BeanConfigure");
	}

	@Bean
	public void monday() {
		System.out.println("method monday");
	}
	@Bean
	public void tuesday() {
		System.out.println("method tuesday");
	}
	@Bean
	public void wednesday() {
		System.out.println("method wednesday");
	}
	@Bean
	public void thursday() {
		System.out.println("method thursday");
	}
	@Bean
	public void friday() {
		System.out.println("method friday");
	}
	@Bean
	public void saturday() {
		System.out.println("method saturday");
	}
	@Bean
	public void sunday() {
		System.out.println("method sunday");
	}
	@Bean
	public void today() {
		System.out.println("method today");
	}
	@Bean
	public void tomarrow() {
		System.out.println("method tomarrow");
	}
	@Bean
	public void yesterday() {
		System.out.println("method yesterday");
	}
}
