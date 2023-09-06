package com.xworkz.chandrayana.app.repository;

public interface PincodeRepository {
    int TOTAL=10;
	void savePin(int pins);
	default boolean isExist(int pin) {
		return false;
	}
	

}
