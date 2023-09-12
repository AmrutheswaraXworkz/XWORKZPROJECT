package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.ApplicationDTO;

public interface ApplicationService {
	
	boolean validateAndSave(ApplicationDTO applicationDTO);

}
