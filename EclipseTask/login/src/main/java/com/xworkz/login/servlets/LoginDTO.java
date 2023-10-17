package com.xworkz.login.servlets;


public class LoginDTO {
	
	private String address;
	private String number;
	private String state;
	private String city;
	private String country;
	
	
	
	
	public LoginDTO(String address, String number, String state, String city, String country) {
		super();
		this.address = address;
		this.number = number;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
