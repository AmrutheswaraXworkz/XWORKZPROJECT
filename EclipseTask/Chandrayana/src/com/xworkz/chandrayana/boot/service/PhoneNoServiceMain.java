package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.PhoneNoRepository;
import com.xworkz.chandrayana.app.repository.PhoneNoRepositoryImpl;
import com.xworkz.chandrayana.app.service.PhoneNoService;
import com.xworkz.chandrayana.app.service.PhoneNoServiceImpl;

public class PhoneNoServiceMain {
public static void main(String[] args) {
	
	PhoneNoRepository phoneNoRepository=new PhoneNoRepositoryImpl();
	PhoneNoService phoneNoService=new PhoneNoServiceImpl(phoneNoRepository);
	long[] call= {6360504953L,9341298015L,9341298015L};
	for(int i=0;i<call.length;i++) {
		phoneNoService.save(call[i]);
	}
}
}
