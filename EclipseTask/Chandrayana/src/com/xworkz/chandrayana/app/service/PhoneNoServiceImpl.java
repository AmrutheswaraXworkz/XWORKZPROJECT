package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.PhoneNoRepository;

public class PhoneNoServiceImpl implements PhoneNoService{
	private PhoneNoRepository phoneNoRepository;
	public PhoneNoServiceImpl(PhoneNoRepository phoneNoRepository) {
			this.phoneNoRepository=phoneNoRepository;
	}
	@Override
	public boolean save(long phones) {
		if(phones!=0 && phones>1000000000L && phones<9999999999L ) {
			if(!phoneNoRepository.isExist(phones)) {
				this.phoneNoRepository.save(phones);
				System.out.println("can be stored");
				return true;
			}
			else {
				System.err.println("cant store duplicate values:"+phones);
			}
			
		}
		else {
			System.err.println("cant store invalid elements:"+phones);
		}
		return false;
	}

}
