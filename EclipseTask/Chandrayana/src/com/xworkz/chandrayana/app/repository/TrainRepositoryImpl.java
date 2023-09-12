package com.xworkz.chandrayana.app.repository;

public class TrainRepositoryImpl implements TrainRepository {

	int position;
	private String[] numbers=new String[TOTAL];
	@Override
	public void store(String numbers) {
		if(this.position<TOTAL) {
			this.numbers[position]=numbers;
			System.out.println("train number:"+numbers+" is stored");
			this.position++;
		}
		else {
			System.err.println("out of memory");
		}

	}
	
	@Override
	public boolean isPresent(String number) {
		for(int i=0;i<=this.position;i++) {
			String temp=numbers[i];
			if(temp!=null &&temp.equals(number)) {
				System.out.println("cannot be stored");
				return true;
			}
		}
		return TrainRepository.super.isPresent(number);
	}

}
