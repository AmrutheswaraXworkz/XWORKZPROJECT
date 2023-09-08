package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class DoctorDto implements Serializable {
	private String name;
	private int exp;
	private String location;
	private int age;

	public DoctorDto() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(String name, int exp, String loc, int age) {
		super();
		this.name = name;
		this.exp = exp;
		this.location = loc;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getLoc() {
		return location;
	}

	public void setLoc(String loc) {
		this.location = loc;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DoctorDto [name=" + name + ", exp=" + exp + ", loc=" + location + ", age=" + age + "]";
	}
	
	

}
