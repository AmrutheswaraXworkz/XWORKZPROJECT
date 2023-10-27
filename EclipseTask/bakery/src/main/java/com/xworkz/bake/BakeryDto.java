package com.xworkz.bake;

public class BakeryDto {
	private String name;
	private String price1;
	private String quantity1;
	private String discount1;
	private String gst;
	private String mDate;
	private String eDate;

	public BakeryDto(String name, String price1, String quantity1, String discount1, String gst, String mDate,
			String eDate) {
		super();
		this.name = name;
		this.price1 = price1;
		this.quantity1 = quantity1;
		this.discount1 = discount1;
		this.gst = gst;
		this.mDate = mDate;
		this.eDate = eDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
	}

	public String getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(String quantity1) {
		this.quantity1 = quantity1;
	}

	public String getDiscount1() {
		return discount1;
	}

	public void setDiscount1(String discount1) {
		this.discount1 = discount1;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public String geteDate() {
		return eDate;
	}

	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	
	

}
