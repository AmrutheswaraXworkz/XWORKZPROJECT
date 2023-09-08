package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.AdhaarDto;
import com.xworkz.dto.app.repository.AdhaarRepository;

public class AdhaarServiceImpl implements AdhaarService {

	
	private AdhaarRepository adhaarRepository;
	public AdhaarServiceImpl( AdhaarRepository adhaarRepository) {
		this.adhaarRepository=adhaarRepository;
	}
	@Override
	public boolean validAndSave(AdhaarDto adhaarDto) {
		if(adhaarDto!=null) {
			System.out.println("adhaarDto is not null");
			String name=adhaarDto.getName();
			long pNo=adhaarDto.getPhoneNo();
			String place=adhaarDto.getPlace();
			int age=adhaarDto.getAge();
			if(name!=null && !name.isEmpty()&&name.length()>4) {
				System.out.println("name is valid");
			}
			else {
				System.err.println("name is invalid");
				return false;
			}
			if(pNo>1000000000L && pNo<9999999999L) {
				System.out.println("phone number is valid");
			}
			else {
				System.err.println("phone number is invalid");
				return false;
			}
			if(place!=null&&!place.isEmpty()&&place.length()>5) {
				System.out.println("place is valid");
			}
			else {
				System.err.println("place is invalid");
				return false;
			}
			if(age>0) {
				System.out.println("age is valid");
			}
			else {
				System.err.println("age is invalid");
				return false;
			}
			this.adhaarRepository.save(adhaarDto);
			return true;
			
		}
		else {
			System.err.println("adhaarDto is null cant saved");
		}
		
		return false;
	}

}
