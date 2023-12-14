package com.xworkz.enumeration.constants;

public enum MovieTicketDiscount {

	LESS(10),MEDIUM(25),FULL(50);

	private Integer discount;
	MovieTicketDiscount(Integer discount) {
		this.discount=discount;
	}
	public Integer getDiscountt() {
		return discount;
	}
	
	
	
}
