package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.WeatherDto;
import com.xworkz.dto.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	
	private WeatherRepository weatherRepository;
	public WeatherServiceImpl(WeatherRepository weatherRepository) {
			this.weatherRepository=weatherRepository;
	}
	@Override
	public boolean vlaidateAndSave(WeatherDto weatherDto) {
		if(weatherDto!=null) {
			System.out.println("weatherDto is not null");
			String place=weatherDto.getPlace();
			double temp=weatherDto.getTemperature();
			int humid=weatherDto.getHumidity();
			
			if(place!=null && !place.isEmpty()&& place.length()>4) {
				System.out.println("place is valid");
			}
			else {
				System.err.println("place is not valid");
				return false;
			}
			
			if(temp>0&&humid>0) {
				System.out.println("temperature and humidity are valid");
				
			}
			else {
				System.err.println("temperature and humidity is invalid");
				return false;
			}
			this.weatherRepository.save(weatherDto);
			return true;
		}
		else {
			System.err.println("weatherDto cannot be stored");
		}
		
		return false;
	}

}
