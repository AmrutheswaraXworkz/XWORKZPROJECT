package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.CitizenLowerAge;
import com.xworkz.enumeration.constants.CitizenUpperAge;
import com.xworkz.enumeration.dto.CitizenDTO;

public class CitizenRunner {
	public static void main(String[] args) {

		CitizenDTO dto = new CitizenDTO(CitizenLowerAge.LOWER_AGE, CitizenUpperAge.UPPER_AGE, "Amruth");
		System.out.println(dto);
		System.out.println(dto.getlAge()+":"+dto.getuAge());
		System.out.println(dto.getlAge().getLowerAge()+":"+dto.getuAge().getUpperAge());
	}
}
