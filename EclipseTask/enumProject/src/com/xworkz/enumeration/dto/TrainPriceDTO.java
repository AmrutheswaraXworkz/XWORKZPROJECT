package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.TrainBasePrice;

public class TrainPriceDTO {

	TrainBasePrice cost;
	
	

	public TrainPriceDTO(TrainBasePrice cost) {
		super();
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "TrainPriceDTO [cost=" + cost + "]";
	}

	public TrainBasePrice getCost() {
		return cost;
	}

	public void setCost(TrainBasePrice cost) {
		this.cost = cost;
	}
	
	
}
