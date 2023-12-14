package com.xworkz.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {

	private String name;
	private int capacity;
	private String location;
	private int price;

	public TheaterDTO(String name, int capacity, String location, int price) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.location = location;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", capacity=" + capacity + ", location=" + location + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(TheaterDTO argument) {
		TheaterDTO theaterDTO=this;
		if(theaterDTO.name==argument.name) {
			return 0;
		}
		if(theaterDTO.price>argument.price) {
			return -20;
		}
		if(theaterDTO.price<argument.price) {
			return 20;
		}
		
		throw new IllegalArgumentException("Cannot compare!!!");
		
	}
	
	
}
