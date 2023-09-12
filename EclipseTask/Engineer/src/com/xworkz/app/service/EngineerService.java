package com.xworkz.app.service;

import com.xworkz.app.dto.EngineerDTO;

public interface EngineerService {

	boolean validateAndSave(EngineerDTO engineerDTO);
}
