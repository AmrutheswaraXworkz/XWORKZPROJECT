package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository{

	int position;
	private ApplicationDTO[] applicationDTO=new ApplicationDTO[TOTAL];
	@Override
	public void save(ApplicationDTO applicationDTO) {
		if(position<TOTAL) {
			this.applicationDTO[position]=applicationDTO;
			System.out.println(applicationDTO+ "is stored in "+this.position);
			this.position++;
		}
		else {
			System.err.println("out of storage,can't store...");
		}
		
	}

	@Override
	public boolean isExist(ApplicationDTO applicationDTO) {
		for(int index=0;index<=position;index++) {
			ApplicationDTO temp=this.applicationDTO[index];
			if(temp!=null && temp.equals(applicationDTO)) {
				System.err.println("Cant store duplicate values "+temp);
				return true;
			}
		}
		return false;
	}

	@Override
	public ApplicationDTO isFoundByName(String name) {
		for(int index=0;index<position;index++) {
			ApplicationDTO temp2=this.applicationDTO[index];
			if(temp2!=null && temp2.getName().equals(name)) {
				System.out.println(name+ " is found");
				return temp2;
			}
			
		}
		
		return null;
	}

	@Override
	public ApplicationDTO isFoundByNameAndDevelopedBy(String name, String developedBy) {
		for(int index=0;index<position;index++) {
			ApplicationDTO temp3=this.applicationDTO[index];
			if(temp3!=null && temp3.getName().equals(name) && temp3.getDevelopedBy().equals(developedBy)) {
				System.out.println(name+","+developedBy+ " is found at "+index);
				return temp3;
			}
			
		}
		return null;
	}

	@Override
	public ApplicationDTO foundAll(int id,String name,String developedBy,String developedAt,String version) {
		for(int index=0;index<=this.position;index++) {
			ApplicationDTO temp4=this.applicationDTO[index];
			if(temp4!=null && temp4.getId()==id && temp4.getName().equals(name) && temp4.getDevelopedBy().equals(developedBy) && temp4.getDevelopedAt().equals(developedAt) && temp4.getVersion().equals(version)) {
				System.out.println(temp4+ " is found at "+index);
				return temp4;
			}
			
		}
		return null;
	}
	
	
	

}
