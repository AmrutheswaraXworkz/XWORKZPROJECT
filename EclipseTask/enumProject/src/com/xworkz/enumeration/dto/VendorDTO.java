package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.VendorGst;
import com.xworkz.enumeration.constants.VendorSerial;

public class VendorDTO {

	private String name;
	private VendorGst gst;
	private VendorSerial serial;

	public VendorDTO(String name, VendorGst gst, VendorSerial serial) {
		super();
		this.name = name;
		this.gst = gst;
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public VendorGst getGst() {
		return gst;
	}

	public VendorSerial getSerial() {
		return serial;
	}

	@Override
	public String toString() {
		return "VendorDTO [name=" + name + ", gst=" + gst + ", serial=" + serial + "]";
	}

	
}
