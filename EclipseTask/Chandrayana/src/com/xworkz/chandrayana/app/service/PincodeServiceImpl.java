package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;
	public PincodeServiceImpl(PincodeRepository pincodeRepository) {
		super();
		this.pincodeRepository=pincodeRepository;
	}
	@Override
	public boolean save(int pins) {
		if(pins!=0 && pins>100000 && pins<999999) {
			if(!pincodeRepository.isExist(pins)) {
				this.pincodeRepository.savePin(pins);
				System.out.println("can store");
				return true;
			}
			else {
				System.err.println("cant store duplicate:" +pins);
			}
		}
		else {
			System.err.println("cant store as it is invalid");
		}
		return false;
	}

}
