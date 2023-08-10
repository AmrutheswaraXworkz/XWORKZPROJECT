package com.xworkz.assignme24.encapsulation.app.metro;

public class Metro {
	private String name;
	private String location;
	private String startPoint;
	private String destinationPoint;
	private int openTime;
	private int closeTime;
	private int startYear;
	private String state;
	private String metroCity;
	private double price;
	private String trainColor;
	private boolean workers;
	private boolean timeSaving;
	private boolean onlinePayment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMetroCity() {
		return metroCity;
	}

	public void setMetroCity(String metroCity) {
		this.metroCity = metroCity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTrainColor() {
		return trainColor;
	}

	public void setTrainColor(String trainColor) {
		this.trainColor = trainColor;
	}

	public boolean isWorkers() {
		return workers;
	}

	public void setWorkers(boolean workers) {
		this.workers = workers;
	}

	public boolean isTimeSaving() {
		return timeSaving;
	}

	public void setTimeSaving(boolean timeSaving) {
		this.timeSaving = timeSaving;
	}

	public boolean isOnlinePayment() {
		return onlinePayment;
	}

	public void setOnlinePayment(boolean onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

}
