package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DevelopersDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {
	

		private int position;
		private DevelopersDTO[] dtos = new DevelopersDTO[TOTAL_DEVELOPERS];

		@Override
		public void saveDeveloperInfo(DevelopersDTO developersDTO) {
			if (this.position < TOTAL_DEVELOPERS) {
				this.dtos[position] = developersDTO;
				System.out.println(developersDTO + " is at index " + position);
				this.position++;
			} else {
				System.err.println("Index out  of range");
			}

		}

		@Override
		public boolean isExist(DevelopersDTO developersDTO) {

			for (int index = 0; index <= position; index++) {
				DevelopersDTO developersDTO2 = dtos[index];
				if (developersDTO2 != null && developersDTO2.equals(developersDTO)) {
					System.out.println("not save");
				}
			}

			return false;
		}

		
		@Override
		public DevelopersDTO findByName(String name) {
			System.out.println("ruuning findByName, args passed " + name);
			System.out.println("Current position: " + this.position);

			for (int index = 0; index < this.position; index++) {
				DevelopersDTO developersDTO = this.dtos[index];

				if (developersDTO.getName().equals(name)) {
					System.out.println("Developer found with name--> " + name);
					return developersDTO;
				} else {
					System.out.println("No devepoer matched");
				}
			}

			return findByName(name);
		}

		

	}

