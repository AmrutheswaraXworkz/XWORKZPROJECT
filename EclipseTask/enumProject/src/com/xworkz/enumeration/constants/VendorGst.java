package com.xworkz.enumeration.constants;

public enum VendorGst {

	GST1(28),GST2(29),GST3(30);
	
	private Integer value;

	private VendorGst(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
	
	
	
	
}
