package com.xworkz.association.app;

public class Trainer {
	
	String name;
	Laptop laptop;
	
	public Trainer(String name) {
		super();
		this.name=name;
		System.out.println("name:"+name);
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop=laptop;
		laptop.lappy();
		System.out.println("laptop:"+laptop);
		
	}

	

}
