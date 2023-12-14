package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.MovieTicketDiscount;
import com.xworkz.enumeration.dto.MovieTicketDTO;

public class MovieTicketRunner {

	public static void main(String[] args) {
		MovieTicketDTO dto=new MovieTicketDTO(200, 28, MovieTicketDiscount.FULL);
		System.out.println(dto);
		System.out.println("Discount is:"+dto.getDiscount().getDiscountt());
	}
}
