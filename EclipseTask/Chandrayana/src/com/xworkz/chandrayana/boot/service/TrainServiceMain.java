package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.TrainRepository;
import com.xworkz.chandrayana.app.repository.TrainRepositoryImpl;
import com.xworkz.chandrayana.app.service.TrainService;
import com.xworkz.chandrayana.app.service.TrainServiceImpl;

public class TrainServiceMain {
public static void main(String[] args) {
	
	TrainRepository trainRepository=new TrainRepositoryImpl();
	TrainService trainService=new TrainServiceImpl(trainRepository);
	String[] number= {"123abc","321bca","456def","456def"};
	for(int index=0;index<number.length;index++) {
		trainService.store(number[index]);
	}
}
}
