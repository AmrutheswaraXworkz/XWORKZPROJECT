package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class WeatherDto implements Serializable {
	private String place;
	private double temperature;
	private int humidity;
	
	public WeatherDto() {
		
	}

	public WeatherDto(String place, double temperature, int humidity) {
		super();
		this.place = place;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "WeatherDto [place=" + place + ", temperature=" + temperature + ", humidity=" + humidity + "]";
	}
	

}
