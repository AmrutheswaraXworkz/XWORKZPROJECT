package com.xworkz.dto.app.dto;

import java.io.Serializable;

public class NewspaperDto implements Serializable{

	private String name;
	private int pages;
	private String authorName;
	private double price;
	
	public NewspaperDto() {
		
	}
	
	public NewspaperDto(String name, int pages, String authorName, double price) {
		super();
		this.name = name;
		this.pages = pages;
		this.authorName = authorName;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "NewspaperDto [name=" + name + ", pages=" + pages + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}
	
	

	

}
