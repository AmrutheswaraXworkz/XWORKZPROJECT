package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.ShoeSize;
import com.xworkz.enumeration.constants.ShoesType;
import com.xworkz.enumeration.dto.ShoeDto;

public class ShoeRunner {

	public static void main(String[] args) {
		ShoeDto shoe = new ShoeDto(ShoesType.CASUALS, ShoeSize.L);
		shoe.setBrand("Nike");
		shoe.setCost(3000D);
		System.out.println(shoe);
		main(1,2);
	}
	
	public static void main(int c,int a) {
		
		System.out.println("hello friends");
		
	}
	
}
