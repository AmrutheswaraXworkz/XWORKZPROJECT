package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.MovieTicketDiscount;

public class MovieTicketDTO {

	private Integer price;
	private Integer gst;
	private MovieTicketDiscount discount;

	public MovieTicketDTO(Integer price, Integer gst, MovieTicketDiscount discount) {
		super();
		this.price = price;
		this.gst = gst;
		this.discount = discount;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getGst() {
		return gst;
	}

	public MovieTicketDiscount getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "MovieTicketDTO [price=" + price + ", gst=" + gst + ", discount=" + discount + "]";
	}

	
}
