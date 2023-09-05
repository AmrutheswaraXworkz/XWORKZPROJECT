package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.JacketRepository;
import com.xworkz.chandrayana.app.repository.JacketRepositoryImpl;
import com.xworkz.chandrayana.app.service.JacketService;
import com.xworkz.chandrayana.app.service.JacketServiceImpl;

public class JacketServiceMain {
public static void main(String[] args) {
	JacketRepository jacketRepository=new JacketRepositoryImpl();
	JacketService jacketService=new JacketServiceImpl(jacketRepository);
		String[] styles= {"","denim","jeans","cotton","woolen"};
	for(int a=0;a<styles.length;a++) {
		jacketService.check(styles[a]);
		
	}
}
}
