package com.xworkz.chandrayana.app.repository;

public class JuiceRepositoryImpl implements JuiceRepository {

	private String[] juices = new String[TOTAL_NO];
	int position;

	@Override
	public void store(String juices) {

		if (this.position < TOTAL_NO) {
			this.juices[position] = juices;
			System.out.println("juices " + juices + " are stored ");
			this.position++;
		} else {
			System.err.println("out of storage,Cant store more");
		}

	}

	@Override
	public boolean isExist(String juice) {
		for (int i = 0; i <=this.position; i++) {
			String temp = juices[i];
			if (temp != null && temp.equals(juice)) {
				System.out.println("it can be stored");
				return true;
			} 		
			}
		return JuiceRepository.super.isExist(juice);
	}

}
