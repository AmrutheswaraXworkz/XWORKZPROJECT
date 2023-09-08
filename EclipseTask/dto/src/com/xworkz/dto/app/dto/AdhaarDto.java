package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class AdhaarDto implements Serializable {
	private String name;
	private long phoneNo;
	private String place;
	private int age;
	
	public AdhaarDto() {
		// TODO Auto-generated constructor stub
	}

	public AdhaarDto(String name, long phoneNo, String place, int age) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "AdhaarDto [name=" + name + ", phoneNo=" + phoneNo + ", place=" + place + ", age=" + age + "]";
	}
	

}
