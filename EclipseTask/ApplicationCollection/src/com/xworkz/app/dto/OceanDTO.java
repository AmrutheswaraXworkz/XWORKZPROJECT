package com.xworkz.app.dto;

public class OceanDTO implements Comparable<OceanDTO> {

	private String name;
	private double area;
	private String fish;
	private String location;

	public OceanDTO(String name, double area, String fish, String location) {
		super();
		this.name = name;
		this.area = area;
		this.fish = fish;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "OceanDTO [name=" + name + ", area=" + area + ", fish=" + fish + ", location=" + location + "]";
	}

	@Override
	public int compareTo(OceanDTO arg) {
		OceanDTO ocean=this;
		if(ocean.area==arg.area)
			return 0;
		if(ocean.area>arg.area)
			return 1;
		if(ocean.area<arg.area)
			return -1;
		
		throw new IllegalArgumentException("Cant compare!!!");
	}

	
	
}
