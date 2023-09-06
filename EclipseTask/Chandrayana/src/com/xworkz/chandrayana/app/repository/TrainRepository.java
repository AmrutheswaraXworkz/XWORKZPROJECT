package com.xworkz.chandrayana.app.repository;

public interface TrainRepository {
	int TOTAL = 10;

	void store(String numbers);

	default boolean isPresent(String number) {
		return false;
	}

}
