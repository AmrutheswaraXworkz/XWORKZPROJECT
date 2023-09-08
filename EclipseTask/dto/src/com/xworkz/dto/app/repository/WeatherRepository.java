package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.WeatherDto;

public interface WeatherRepository {
	int TOTAL_PLACES = 10;
	void save(WeatherDto weatherDto);
	
}
