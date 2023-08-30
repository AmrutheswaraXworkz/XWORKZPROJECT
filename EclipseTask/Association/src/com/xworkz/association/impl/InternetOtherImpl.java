package com.xworkz.association.impl;

import com.xworkz.association.app.Internet;

public class InternetOtherImpl implements Internet {
	@Override
	public void connect() {
		System.out.println("Calling connect in Internet other implementation Class...");
	}
}
