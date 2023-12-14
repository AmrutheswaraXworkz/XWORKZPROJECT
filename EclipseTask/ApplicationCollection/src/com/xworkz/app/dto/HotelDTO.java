package com.xworkz.app.dto;

public class HotelDTO {
	private int id;
	private String name;
	private String ownerName;
	private double gst;
	private String location;

	public HotelDTO(int id, String name, String ownerName, double gst, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.gst = gst;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gst=" + gst + ", location="
				+ location + "]";
	}

	
	
}
