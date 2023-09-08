package com.xworkz.dto.app.repository;



import com.xworkz.dto.app.dto.NewspaperDto;

public class NewspaperRepositoryImpl implements NewsPapersRepository {

	int position;
	private NewspaperDto[] dtos=new NewspaperDto[TOTAL_ITEM];
	@Override
	public void save(NewspaperDto dto) {
		if(position<TOTAL_ITEM) {
			this.dtos[position]=dto;
			System.out.println(dto+" is stored in position "+this.position);
			this.position++;
		}
		else {
			System.err.println("storage full.... cannot store");
		}
		
	}
		

}
