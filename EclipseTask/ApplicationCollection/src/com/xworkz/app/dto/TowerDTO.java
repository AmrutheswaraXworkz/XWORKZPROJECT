package com.xworkz.app.dto;

public class TowerDTO implements Comparable<TowerDTO> {

	private String name;
	private int height;
	private String location;
	private double cost;

	public TowerDTO(String name, int height, String location, double cost) {
		super();
		this.name = name;
		this.height = height;
		this.location = location;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "TowerDTO [name=" + name + ", height=" + height + "Meter, location=" + location + ", cost=" + cost + "Billion]";
	}

	@Override
	public int compareTo(TowerDTO arg) {
		TowerDTO tower=this;
		if(tower.height==arg.height) {
			return 0;
		}
		if(tower.height>arg.height) {
			return 1;
		}
		if(tower.height<arg.height) {
			return -1;
		}
		
		throw new IllegalArgumentException("Cant compare!!!");
		
	}

	
}
