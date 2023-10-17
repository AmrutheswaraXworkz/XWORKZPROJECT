package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.CollegeDTO;

public class CollegeRepositoryImpl implements CollegeRepository {

	
	int position;
	private CollegeDTO[] collegeDto=new CollegeDTO[TOTAL];
	@Override
	public void save(CollegeDTO collegeDto) {
		if(position<TOTAL) {
			this.collegeDto[position]=collegeDto;
			System.out.println(collegeDto+" is saved in position "+this.position);
			this.position++;
		}
		else {
			System.err.println("out of storage :(");
		}
		
	}

	@Override
	public boolean isExist(CollegeDTO collegeDto) {
		for(int index=0;index<this.position;index++) {
			CollegeDTO temp=this.collegeDto[index];
			if(temp!=null && temp.equals(collegeDto)) {
				System.err.println("cant store duplicate values:"+temp);
				return true;
			}
		}
		return false;
	}

	@Override
	public CollegeDTO isFound(int cId, String name) {
		for(int i=0;i<this.position;i++) {
			CollegeDTO temp2=this.collegeDto[i];
			if(temp2!=null && temp2.getcId()==cId && temp2.getcName().equals(name)) {
				System.out.println( cId+"," +name+" found at position "+i);
				return temp2;
			}
			
		}
		return null;
	}

}
