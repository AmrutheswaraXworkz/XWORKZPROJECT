package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.CitizenLowerAge;
import com.xworkz.enumeration.constants.CitizenUpperAge;

public class CitizenDTO {

	private CitizenLowerAge lAge;
	private CitizenUpperAge uAge;
	private String name;

	public CitizenDTO(CitizenLowerAge lAge, CitizenUpperAge uAge, String name) {
		super();
		this.lAge = lAge;
		this.uAge = uAge;
		this.name = name;
	}

	public CitizenLowerAge getlAge() {
		return lAge;
	}

	public CitizenUpperAge getuAge() {
		return uAge;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CitizenDTO [lAge=" + lAge + ", uAge=" + uAge + ", name=" + name + "]";
	}

	
}
