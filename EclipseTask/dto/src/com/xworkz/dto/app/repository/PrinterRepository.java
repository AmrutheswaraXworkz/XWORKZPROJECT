package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.PrinterDto;

public interface PrinterRepository {

	int TOTAL=10;
	void save(PrinterDto printerDto);
}
