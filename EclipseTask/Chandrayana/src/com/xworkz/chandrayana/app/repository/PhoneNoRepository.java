package com.xworkz.chandrayana.app.repository;

public interface PhoneNoRepository {
	int TOTAL=10;
	void save(long phones);
	
	default boolean isExist(long phone) {
		return false;
	}

}
