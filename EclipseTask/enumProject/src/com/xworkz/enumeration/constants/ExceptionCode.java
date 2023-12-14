package com.xworkz.enumeration.constants;

public enum ExceptionCode {

	ERROR(404),WARNING(400),EXCEPTION(405);
	
	private Integer warning;

	ExceptionCode(int warning) {
		this.warning=warning;
	}

	public Integer getWarning() {
		return warning;
	}
}
