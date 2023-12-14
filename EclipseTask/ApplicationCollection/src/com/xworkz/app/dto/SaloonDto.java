package com.xworkz.app.dto;

public class SaloonDto {

	private int id;
	private String name;
	private int price;
	private String usage;
	private boolean man;
	public SaloonDto(int id, String name, int price, String usage, boolean man) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.usage = usage;
		this.man = man;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	@Override
	public String toString() {
		return "SaloonDto [id=" + id + ", name=" + name + ", price=" + price + ", usage=" + usage + ", man=" + man
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof SaloonDto) {
				SaloonDto saloonDto=(SaloonDto)obj;
				if(saloonDto.getId()==id && saloonDto.getName().equals(name)) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}
}
