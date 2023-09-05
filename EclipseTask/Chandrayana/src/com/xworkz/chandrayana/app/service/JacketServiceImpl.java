package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.JacketRepository;

public class JacketServiceImpl implements JacketService {

	JacketRepository jacketRepository;
	public JacketServiceImpl(JacketRepository jacketRepository)
	{
		super();
		this.jacketRepository=jacketRepository;
	}
	@Override
	public boolean check(String styles) {
		if(styles!=null&& !styles.isEmpty() && styles.length()>3)
		{
			System.out.println("valid input");
			this.jacketRepository.style(styles);
		}
		else {
			System.out.println("invalid");
		}
		return false;
	}

}
