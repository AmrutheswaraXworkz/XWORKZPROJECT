package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.AdhaarDto;

public interface AdhaarRepository {

	int TOTAL_PEOPLE=10;
	void save(AdhaarDto adhaarDto);
}
