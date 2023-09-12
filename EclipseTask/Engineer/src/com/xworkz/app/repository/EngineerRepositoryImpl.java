package com.xworkz.app.repository;

import com.xworkz.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {

	int position;
	private EngineerDTO[] engineerDTO = new EngineerDTO[TOTAL];

	@Override
	public void save(EngineerDTO engineerDTO) {
		if (position < TOTAL) {
			this.engineerDTO[this.position] = engineerDTO;
			System.out.println(engineerDTO + " is stored in positon " + this.position);
			this.position++;

		} else {
			System.err.println("out of storage,can't store");
		}

	}

	@Override
	public boolean isExist(EngineerDTO engineerDTO) {
		for (int index = 0; index <= position; index++) {
			EngineerDTO temp = this.engineerDTO[index];
			if (temp != null && temp.equals(engineerDTO)) {
				System.err.println("Cant store duplicate values:" + engineerDTO);
				return true;
			}
		}
		return false;
	}

	@Override
	public EngineerDTO isFound(String name) {
		for (int index = 0; index < position; index++) {
			EngineerDTO temp1 = this.engineerDTO[index];
			if (temp1 != null && temp1.getName().equals(name)) {
				System.out.println(name + " is found at " + index);
				return temp1;

			}
		}
		return null;
	}

}
