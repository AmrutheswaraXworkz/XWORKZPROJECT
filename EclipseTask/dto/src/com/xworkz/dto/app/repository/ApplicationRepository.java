package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.ApplicationDTO;

public interface ApplicationRepository {
	int TOTAL=10;
	void save(ApplicationDTO applicationDTO);
	boolean isExist(ApplicationDTO applicationDTO);
	ApplicationDTO isFoundByName(String name);
	ApplicationDTO isFoundByNameAndDevelopedBy(String name,String developedBy);
	ApplicationDTO foundAll(int id,String name,String developedBy,String developedAt,String version);
	ApplicationDTO foundAllByDevelopedBy(String developedBy);
}
