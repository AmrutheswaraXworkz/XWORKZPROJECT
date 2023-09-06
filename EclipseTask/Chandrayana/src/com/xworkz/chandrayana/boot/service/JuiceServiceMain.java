package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.JuiceRepository;
import com.xworkz.chandrayana.app.repository.JuiceRepositoryImpl;
import com.xworkz.chandrayana.app.service.JuiceService;
import com.xworkz.chandrayana.app.service.JuiceServiceImpl;

public class JuiceServiceMain {
	public static void main(String[] args) {
		JuiceRepository juiceRepository = new JuiceRepositoryImpl();
		JuiceService juiceService = new JuiceServiceImpl(juiceRepository);
		String[] juice = { "maza", "frootie", "cococola", "cococola" };
		for (int y = 0; y < juice.length; y++) {
			juiceService.validateAndStore(juice[y]);

		}
	}
}
