package com.xworkz.chandrayana.app.repository;

public class PincodeRepositoryImpl implements PincodeRepository {

	private int[] pins = new int[TOTAL];
	int position;

	@Override
	public void savePin(int pins) {
		if (position < TOTAL) {
			this.pins[position] = pins;
			System.out.println("pin " + pins + " are stored");
			this.position++;

		}
		else {
			System.err.println("out of storage");
		}

	}
	
	@Override
	public boolean isExist(int pin) {
		for(int i=0;i<=this.position;i++) {
			int temp=pins[i];
			if(temp!=0 && temp==pin) {
				System.out.println("it cannot be stored");
				return true;
			}
		}
		return PincodeRepository.super.isExist(pin);
	}

}
