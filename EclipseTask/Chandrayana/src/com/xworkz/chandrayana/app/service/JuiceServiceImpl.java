package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {

	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndStore(String juices) {
		if (juices != null && !juices.isEmpty() && juices.length() > 3 && juices.length() < 20) {

			if (!juiceRepository.isExist(juices)) {
				this.juiceRepository.store(juices);
				System.out.println("can store");

				return true;
			} else {
				System.err.println("cant store duplicate:" + juices);
			}

		} else {
			System.err.println("cant store as it is invalid");
		}
		return false;
	}

}
