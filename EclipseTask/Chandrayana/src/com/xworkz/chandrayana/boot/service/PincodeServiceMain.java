package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.PincodeRepository;
import com.xworkz.chandrayana.app.repository.PincodeRepositoryImpl;
import com.xworkz.chandrayana.app.service.PincodeService;
import com.xworkz.chandrayana.app.service.PincodeServiceImpl;

public class PincodeServiceMain {
	public static void main(String[] args) {
		PincodeRepository pincodeRepository=new PincodeRepositoryImpl();
		PincodeService pincodeService=new PincodeServiceImpl(pincodeRepository);
		
		int[] pins= {577001,577001,566041,577002};
		for(int city=0;city<pins.length;city++) {
			pincodeService.save(pins[city]);
		}
	}

}
