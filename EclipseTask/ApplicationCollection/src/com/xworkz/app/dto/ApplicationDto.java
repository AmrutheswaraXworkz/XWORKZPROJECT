package com.xworkz.app.dto;

import java.time.LocalDate;

public class ApplicationDto {
	
	private String name;
	private String version;
	private String companyName;
	private LocalDate createDate;
	private double rating;
	
	public ApplicationDto() {
		System.out.println("Running ApplicationDto");
	}

	public ApplicationDto(String name, String version, String companyName, LocalDate createDate, double rating) {
		super();
		this.name = name;
		this.version = version;
		this.companyName = companyName;
		this.createDate = createDate;
		this.rating = rating;
		
	
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ApplicationDto [name=" + name + ", version=" + version + ", companyName=" + companyName
				+ ", createDate=" + createDate + ", rating=" + rating + "]";
	}

	

}
