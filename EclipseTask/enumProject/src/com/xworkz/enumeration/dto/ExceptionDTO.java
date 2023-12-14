package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.constants.ExceptionCode;

public class ExceptionDTO {

	private ExceptionCode code;
	
	

	public ExceptionDTO(ExceptionCode code) {
		super();
		this.code = code;
	}

	public ExceptionCode getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "ExceptionDTO [code=" + code + "]";
	}
	
	
}
