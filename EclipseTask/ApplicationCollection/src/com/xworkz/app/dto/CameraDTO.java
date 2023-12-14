package com.xworkz.app.dto;

import java.time.LocalDate;

public class CameraDTO {

	private int id;
	private String brand;
	private String model;
	private double cost;
	private LocalDate manufactureDate;

	public CameraDTO(int id, String brand, String model, double cost, LocalDate manufactureDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
		this.manufactureDate = manufactureDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", cost=Rs" + cost + ", manufactureDate="
				+ manufactureDate + "]";
	}

	
	
}
