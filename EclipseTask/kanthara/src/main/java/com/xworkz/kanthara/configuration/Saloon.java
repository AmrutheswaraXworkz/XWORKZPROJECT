package com.xworkz.kanthara.configuration;

import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private Ajama ajama;
	
	private Customer customer;
	
	public Saloon(Ajama ajama,Customer customer2) {
		this.ajama=ajama;
		this.customer=customer2;
	}
	
}
 