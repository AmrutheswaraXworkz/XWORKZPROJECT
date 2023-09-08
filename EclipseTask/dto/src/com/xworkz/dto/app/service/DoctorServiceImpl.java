package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DoctorDto;
import com.xworkz.dto.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {

	
	private DoctorRepository doctorRepository;
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository=doctorRepository;
	}
	@Override
	public boolean validSave(DoctorDto doctorDto) {
		if(doctorDto!=null) {
			System.out.println("doctorDto is not null");
			String name=doctorDto.getName();
			int exp=doctorDto.getExp();
			String loc=doctorDto.getLoc();
			int age=doctorDto.getAge();
			
			if(name!=null && !name.isEmpty() && name.length()>5) {
				System.out.println("name is valid");
			}
			else {
				System.err.println("name is invalid");
				return false;
			}
			if(exp>0) {
				System.out.println("experience is valid");
			}
			else {
				System.err.println("experience is invalid");
				return false;
			}
			if(loc!=null && !loc.isEmpty() && loc.length()>5) {
				System.out.println("location is valid");
			}
			else {
				System.err.println("location is invalid");
				return false;
			}
			if(age>30) {
				System.out.println("age is valid");
			}
			else {
				System.err.println("age is invalid");
				return false;
			}
			this.doctorRepository.saveInfo(doctorDto);
			return true;
		}
		else {
			System.out.println("doctorDto is null");
		}
		return false;
	}

}
