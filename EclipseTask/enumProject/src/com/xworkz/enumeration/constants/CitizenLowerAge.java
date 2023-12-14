package com.xworkz.enumeration.constants;

public enum CitizenLowerAge {

	LOWER_AGE(18);

	private Integer lowerAge;

	CitizenLowerAge(int lowerAge) {
		this.lowerAge = lowerAge;
	}

	public Integer getLowerAge() {
		return lowerAge;
	}

	
	
}
