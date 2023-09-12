package com.xworkz.chandrayana.app.repository;

public class PhoneNoRepositoryImpl implements PhoneNoRepository {
	
	
	private long[] phones=new long[TOTAL];
	int position;
	@Override
	public void save(long phones) {
		if(position<TOTAL) {
			this.phones[position]=phones;
			System.out.println("phone number:"+phones+" is stored");
			this.position++;
			
		}
		else {
			System.err.println("cant store,out of memory");
		}
			
		
	}
	@Override
	public boolean isExist(long phone) {
		for(int i=0;i<this.position;i++) {
			long temp=phones[i];
			if(temp!=0 && temp==phone) {
				System.out.println("it cannot be stored");
				return true;
			}
		}
		return PhoneNoRepository.super.isExist(phone);
	}

}
