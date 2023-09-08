package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.WeatherDto;

public class WeatherRepositoryImpl implements WeatherRepository {

	int position;
	private WeatherDto[] weatherDto=new WeatherDto[TOTAL_PLACES];
	@Override
	public void save(WeatherDto weatherDto) {
		if(position<TOTAL_PLACES) {
			this.weatherDto[position]=weatherDto;
			System.out.println(weatherDto+" is stored");
			this.position++;
		}
		else {
			System.err.println("cant store,out of memory");
		}
		
	}

	
}
