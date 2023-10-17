package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.CollegeDTO;
import com.xworkz.dto.app.repository.CollegeRepository;

public class CollegeServiceImpl implements CollegeService {

	private CollegeRepository collegeRepository;
	public CollegeServiceImpl(CollegeRepository collegeRepository) {
		this.collegeRepository=collegeRepository;
	}
	@Override
	public boolean validateAndSave(CollegeDTO collegeDto) {
		if(collegeDto!=null) {
			int id=collegeDto.getcId();
			String cname=collegeDto.getcName();
			String address=collegeDto.getAddress();
			long pno =collegeDto.getPhoneNo();
			String web=collegeDto.getWebsite();
			String email=collegeDto.getEmail();
			int year=collegeDto.getYear();
			
			if(id>0) {
				System.out.println("id is valid");
			}
			else {
				System.err.println("id is invalid cannot save");
				return false;
			}
			if(cname!=null && !cname.isEmpty() && cname.length()>4) {
				System.out.println("college name is valid");
			}
			else {
				System.err.println("college name is not valid cannot store");
				return false;
			}
			if(address!=null && !address.isEmpty() && address.length()>4) {
				System.out.println("address is valid");
			}
			else {
				System.err.println("address name is not valid cannot store");
				return false;
			}
			if(pno>1000000000L && pno<9999999999L) {
				
				System.out.println("phone number is valid");
			}
			else {
				System.err.println("phone nummber is not valid");
				return false;
			}
			if(web!=null && !web.isEmpty() && web.length()>4) {
				System.out.println("web is valid");
			}
			else {
				System.err.println("web is not valid cannot store");
				return false;
			}
			if(email!=null && !email.isEmpty() && email.length()>4) {
				System.out.println("email is valid");
			}
			else {
				System.err.println("email is not valid cannot store");
				return false;
			}
			if(year>1900) {
				System.out.println("year is valid");
			}
			else {
				System.err.println("year is  invalid cannot store");
				return false;
			}
			if(!collegeRepository.isExist(collegeDto)) {
				this.collegeRepository.save(collegeDto);
				return true;
			}
			else {
				System.err.println("collegeDto is null cannot store");
			}
		}
		return false;
	}
}
