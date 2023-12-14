package com.xworkz.automobile.repository;


import java.util.List;

import com.xworkz.automobile.dto.AutomobileDTO;

public interface AutomobileRepository {

	//public void saveDetails(AutomobileDTO automobile);
	
	public void saveVehicle(AutomobileDTO automobileDTO);
	
	public void saveList(List<AutomobileDTO> list);
	
	public void updateVehicleByName(List<AutomobileDTO> list);
	
	public List<AutomobileDTO> fetchAllVehicles();

}
