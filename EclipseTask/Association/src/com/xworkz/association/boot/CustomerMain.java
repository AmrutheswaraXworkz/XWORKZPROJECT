package com.xworkz.association.boot;

import com.xworkz.association.app.Customer;
import com.xworkz.association.app.PassportVerification;
import com.xworkz.association.impl.PassportVerificationImpl;

public class CustomerMain {
	public static void main(String[] args) {
		
	
	PassportVerification passportVerification = new PassportVerificationImpl();

	Customer customer = new Customer();
	customer.setVerification(passportVerification);
	
	customer.verifyCitizen();
}
}
