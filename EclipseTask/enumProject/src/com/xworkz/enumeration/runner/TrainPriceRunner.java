package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.TrainBasePrice;
import com.xworkz.enumeration.dto.TrainPriceDTO;

public class TrainPriceRunner {

	public static void main(String[] args) {
		TrainPriceDTO dto=new TrainPriceDTO(TrainBasePrice.AC_COUCH);
		System.out.println(dto);
		System.out.println("price is:"+dto.getCost().getPrice());
	}
}
