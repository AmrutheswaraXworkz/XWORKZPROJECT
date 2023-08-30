package com.xworkz.association.impl;

import com.xworkz.association.app.Computer;

public class Programmer {
private Computer computer;
	
	public void operate() {
		System.out.println("calling method in Programmer Class ......");
		this.computer.information();
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
