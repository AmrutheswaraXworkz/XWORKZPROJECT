package com.xworkz.app.dto;

public class EngineerDTO {
	
	private int id;
	private String name;
	private String collegeName;
	
	public EngineerDTO() {
		// TODO Auto-generated constructor stub
	}

	public EngineerDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof EngineerDTO) {
				EngineerDTO engineerDTO=(EngineerDTO)obj;
				if(engineerDTO.name.equals(name) && engineerDTO.collegeName.equals(collegeName) && engineerDTO.id==id) {
					return true;
				}
			}
			
		}
		return super.equals(obj);
	}
	

}
