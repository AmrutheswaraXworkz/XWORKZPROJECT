package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.ShoeSize;
import com.xworkz.enumeration.constants.ShoesType;

public class ShoeDto {

	private ShoesType type;
	private String brand;
	private ShoeSize size;
	private Double cost;

	public ShoeDto(ShoesType type, ShoeSize size) {
		super();
		this.type = type;
		this.size = size;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ShoeDto:[type=" + type + ", brand=" + brand + ", size=" + size + ", cost=" + cost + "]";
	}

}
