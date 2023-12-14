package com.xworkz.enumeration.constants;

public enum TrainBasePrice {

	GENERAL(100),SLEEPER(150),AC_COUCH(200);

	private int price;
	TrainBasePrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
