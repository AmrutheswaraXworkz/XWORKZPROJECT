package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.AutomobileDTO;

public interface AutomobileService {

	public void validateAndSave(AutomobileDTO automobile);
	
	public void listValidateAndSave(List<AutomobileDTO> automobileDTO);
	
	public List<AutomobileDTO> fetchDetails();
	

}
