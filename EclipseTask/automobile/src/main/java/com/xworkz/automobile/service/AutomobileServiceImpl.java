package com.xworkz.automobile.service;

import java.util.ArrayList;
import java.util.List;
import com.xworkz.automobile.dto.AutomobileDTO;
import com.xworkz.automobile.repository.AutomobileRepository;
import com.xworkz.automobile.repository.AutomobileRepositoryImpl;

public class AutomobileServiceImpl implements AutomobileService {

	public AutomobileServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validateAndSave(AutomobileDTO automobile) {

		if (automobile.getName() != null && automobile.getColor() != null && automobile.getType() != null) {
			AutomobileRepository repo = new AutomobileRepositoryImpl();
			repo.saveVehicle(automobile);
			System.out.println("inserted");
		} else {
			System.out.println("values of tables are null");
		}

	}

	@Override
	public void listValidateAndSave(List<AutomobileDTO> automobileDTO) {

		for (AutomobileDTO automobileDTO2 : automobileDTO) {
			if ((automobileDTO2).getName() != null && (automobileDTO2).getColor() != null
					&& (automobileDTO2).getType() != null) {

				AutomobileRepository repo = new AutomobileRepositoryImpl();
				repo.saveList(automobileDTO);
				System.out.println("inserted");
			} else {
				System.out.println("values of tables are null");
			}
		}

	}

	@Override
	public List<AutomobileDTO> fetchDetails() {
		AutomobileRepository repo = new AutomobileRepositoryImpl();
//		List<AutomobileDTO> auto = repo.fetchAllVehicles();
//		auto.forEach(c->System.out.println(c));
		List<AutomobileDTO> auto =repo.fetchAllVehicles();
		for(AutomobileDTO dto:auto) {
			System.out.println(dto.getName());
			System.out.println(dto.getColor());
			System.out.println(dto.getType());
			System.out.println(dto.getModel());
			System.out.println("----------");
		}

		return null;
	}
}
