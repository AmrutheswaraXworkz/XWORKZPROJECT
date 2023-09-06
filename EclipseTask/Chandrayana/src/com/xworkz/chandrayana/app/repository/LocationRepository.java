package com.xworkz.chandrayana.app.repository;

public interface LocationRepository {
	int NO=10;
	void saveLoc(String names);
	default  boolean isThere(String name) {
		return false;
	}

}
