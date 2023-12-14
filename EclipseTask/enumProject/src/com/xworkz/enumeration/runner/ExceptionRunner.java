package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.constants.ExceptionCode;
import com.xworkz.enumeration.dto.ExceptionDTO;

public class ExceptionRunner {

	public static void main(String[] args) {
		ExceptionDTO dto=new ExceptionDTO(ExceptionCode.EXCEPTION);
		System.out.println(dto);
		System.out.println(dto.getCode().getWarning());
	}
}
