package com.xworkz.kanthara.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ajama {

	private Scissors scissors;

	@Autowired
	public Ajama(Scissors metal) {
		this.scissors = metal;
		System.out.println("Created Ajama..");
	}
}
