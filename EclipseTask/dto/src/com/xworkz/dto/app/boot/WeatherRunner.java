package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.WeatherDto;
import com.xworkz.dto.app.repository.WeatherRepository;
import com.xworkz.dto.app.repository.WeatherRepositoryImpl;
import com.xworkz.dto.app.service.WeatherService;
import com.xworkz.dto.app.service.WeatherServiceImpl;

public class WeatherRunner {
	public static void main(String[] args) {
		
		WeatherRepository weatherRepository=new WeatherRepositoryImpl();
		WeatherService weatherService=new WeatherServiceImpl(weatherRepository);
		WeatherDto wdtos=new WeatherDto("Davangere",97.3, 50);
		boolean save=weatherService.vlaidateAndSave(wdtos);
		System.out.println("saved:"+save);
	}

}
