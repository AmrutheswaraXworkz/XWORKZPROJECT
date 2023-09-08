package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.NewspaperDto;
import com.xworkz.dto.app.repository.NewsPapersRepository;



public class NewspaperServiceImpl implements NewspaperService{

	private NewsPapersRepository newspaperRepository;
	public NewspaperServiceImpl(NewsPapersRepository newspaperRepository) {
		this.newspaperRepository=newspaperRepository;
	}
	
	@Override
	public boolean validateAndSave(NewspaperDto dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
			String auth =dto.getAuthorName();
			String name=dto.getName();
			int pages=dto.getPages();
			double cost=dto.getPrice();
			
			if(auth!=null&&!auth.isEmpty()&&auth.length()>=3) {
				System.out.println("author name is valid");
			}
			else {
				System.err.println("author name is not valid..");
				return false;
			}
			if(name!=null&&!name.isEmpty()&&name.length()>=3) {
				System.out.println("name is valid");
			}
			else {
				System.err.println("name is not valid..");
				return false;
			}
			if(pages >0 && cost>0) {
				System.out.println("pages and cost are valid");
			}
			else {
				System.err.println("pages and cost are not valid");
				return false;
			}
			this.newspaperRepository.save(dto);
			return true;
		}
		else {
			System.out.println("dto is null cant be stored");
		}
		return false;
	}

}
