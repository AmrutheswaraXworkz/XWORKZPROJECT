package com.xworkz.association.app;

public class Mobile {
	private Charger charger;
	private String brand;
	private double cost;
	private double screenSize;
	private int storage;

	public Mobile(String brand, double cost, double screenSize, int storage) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.screenSize = screenSize;
		this.storage = storage;

		System.out.println("Brand: " + brand);
		System.out.println("cost: " + cost);
		System.out.println("screenSize: " + screenSize);
		System.out.println("storage: " + storage);
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
		charger.cable();
		charger.chargerColor();
		charger.chargerSpees();
		charger.type();
	}
}
