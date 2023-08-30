package com.xworkz.association.impl;

import com.xworkz.association.app.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("Calling connect method from Browser Class...");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

}
