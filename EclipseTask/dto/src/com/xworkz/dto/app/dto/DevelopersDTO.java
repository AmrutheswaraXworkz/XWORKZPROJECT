package com.xworkz.dto.app.dto;

public class DevelopersDTO {
	
		private String name;
		private int experience;
		private double salary;
		private String workingFor;
		private String designation;
		private boolean difficult;

		public DevelopersDTO() {
			// TODO Auto-generated constructor stub
		}

		public DevelopersDTO(String name, int experience, double salary, String workingFor, String designation,
				boolean difficult) {
			super();
			this.name = name;
			this.experience = experience;
			this.salary = salary;
			this.workingFor = workingFor;
			this.designation = designation;
			this.difficult = difficult;
		}

		public String getName() {
			return name;
		}

		public int getExperience() {
			return experience;
		}

		public double getSalary() {
			return salary;
		}

		public String getWorkingFor() {
			return workingFor;
		}

		public String getDesignation() {
			return designation;
		}

		public boolean isDifficult() {
			return difficult;
		}

		@Override
		public String toString() {
			return "DevelopersDTO [name=" + name + ", experience=" + experience + ", salary=" + salary + ", workingFor="
					+ workingFor + ", designation=" + designation + ", difficult=" + difficult + "]";
		}

		@Override
		public boolean equals(Object obj) {

			if (obj != null) {
				if (obj instanceof DevelopersDTO) {
					DevelopersDTO developersDTO = (DevelopersDTO) obj;
					if (developersDTO.name.equals(name) && developersDTO.workingFor.equals(workingFor)
							&& developersDTO.designation.equals(designation)) {
						return true;
					}
				}
			}

			return super.equals(obj);
		}

	}


