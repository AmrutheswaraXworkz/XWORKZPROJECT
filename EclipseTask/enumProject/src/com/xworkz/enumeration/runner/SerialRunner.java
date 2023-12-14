package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.VendorGst;
import com.xworkz.enumeration.constants.VendorSerial;
import com.xworkz.enumeration.dto.VendorDTO;

public class SerialRunner {

	public static void main(String[] args) {
		VendorDTO dto=new VendorDTO("Amruth", VendorGst.GST2, VendorSerial.SERIAL2);
		System.out.println(dto);
		System.out.println(dto.getGst());
		System.out.println(dto.getGst().getValue());
	}
}
