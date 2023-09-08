package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.NewspaperDto;

public interface NewsPapersRepository {
	

		int TOTAL_ITEM=5;
		void save(NewspaperDto dto);
	}


