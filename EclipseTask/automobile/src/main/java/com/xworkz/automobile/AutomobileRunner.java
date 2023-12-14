package com.xworkz.automobile;



import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.dto.AutomobileDTO;
import com.xworkz.automobile.repository.AutomobileRepository;
import com.xworkz.automobile.repository.AutomobileRepositoryImpl;
import com.xworkz.automobile.service.AutomobileService;
import com.xworkz.automobile.service.AutomobileServiceImpl;

public class AutomobileRunner {

	public static void main(String[] args) {
		AutomobileDTO dto=new AutomobileDTO("Audi","Red", "Car", 1);
		AutomobileDTO dto1=new AutomobileDTO("BMW", "White", "Car", 2);
//		AutomobileService service=new AutomobileServiceImpl();
//		service.validateAndSave(dto);
//		service.validateAndSave(dto1);
		
		List<AutomobileDTO> list=new ArrayList<AutomobileDTO>();
		list.add(dto);
		list.add(dto1);
		list.add(dto1);
		AutomobileService ser=new AutomobileServiceImpl();
		ser.listValidateAndSave(list);
		AutomobileRepository repo=new AutomobileRepositoryImpl();
		repo.updateVehicleByName(list);
		ser.fetchDetails();
		
		
		
		
		
		
	
		
		
		
	}
}
