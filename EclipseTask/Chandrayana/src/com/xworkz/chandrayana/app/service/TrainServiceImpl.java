package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.TrainRepository;

public class TrainServiceImpl implements TrainService {

	private TrainRepository trainRepository;

	public TrainServiceImpl(TrainRepository trainRepository) {
		this.trainRepository = trainRepository;
	}

	@Override
	public boolean store(String numbers) {
		if(numbers!=null && !numbers.isEmpty() && numbers.length()>4)
		{
			if(!trainRepository.isPresent(numbers)) {
				this.trainRepository.store(numbers);
				System.out.println("can store");
			}
			else {
				System.err.println("cant store duplicate values:"+numbers);
			}
		}
		else {
			System.err.println("cant store as it is invalid");
		}

		return false;
	}

}
