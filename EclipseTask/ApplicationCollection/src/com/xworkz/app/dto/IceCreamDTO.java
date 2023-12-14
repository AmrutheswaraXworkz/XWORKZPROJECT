package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class IceCreamDTO implements Serializable {

	private String flavour;
	private String color;
	private Double price;
	private LocalDate manDate;
	private String type;

	public IceCreamDTO(String flavour, String color, double price,LocalDate manDate,String type) {
		super();
		this.flavour = flavour;
		this.color = color;
		this.price = price;
		this.manDate=manDate;
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getManDate() {
		return manDate;
	}

	public void setManDate(LocalDate manDate) {
		this.manDate = manDate;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [flavour=" + flavour + ", color=" + color + ", price=" + price + ", manDate=" + manDate
				+ ", type=" + type + "]";
	}

	
}
