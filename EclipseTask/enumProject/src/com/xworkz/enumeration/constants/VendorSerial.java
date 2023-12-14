package com.xworkz.enumeration.constants;

public enum VendorSerial {

	SERIAL1(10), SERIAL2(11), SERIAL3(12);

	private Integer number;

	VendorSerial(int number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

}
