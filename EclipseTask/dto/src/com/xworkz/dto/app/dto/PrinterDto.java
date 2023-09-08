package com.xworkz.dto.app.dto;

public class PrinterDto {

	private String deviceName;
	private int copies;
	private double price;
	private String color;
	
	public PrinterDto() {
		// TODO Auto-generated constructor stub
	}

	public PrinterDto(String deviceName, int copies, double price, String color) {
		super();
		this.deviceName = deviceName;
		this.copies = copies;
		this.price = price;
		this.color = color;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PrinterDto [deviceName=" + deviceName + ", copies=" + copies + ", price=" + price + ", color=" + color
				+ "]";
	}
	
}
