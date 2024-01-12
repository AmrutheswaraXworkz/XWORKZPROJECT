package com.xworkz.kanthara.configuration;

import org.springframework.stereotype.Component;

@Component
public class Stamp {

	private BeanClass beans;
	
	
	public Stamp(BeanClass beans) {
		this.beans=beans;
		System.out.println("Argument constructor of stamp");
		System.out.println(beans);
	}
}
