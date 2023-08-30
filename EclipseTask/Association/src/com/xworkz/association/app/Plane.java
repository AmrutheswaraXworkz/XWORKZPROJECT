package com.xworkz.association.app;

public class Plane extends Customer {
	public void airoPlane() {
		Customer customer=new Customer();
		System.out.println("invoking airoPlane in Customer");
		customer.verifyCitizen();
	}

}
