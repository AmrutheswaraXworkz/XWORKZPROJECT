package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.NewspaperDto;

public interface NewspaperService {
	boolean validateAndSave(NewspaperDto dto);
	
	
}
