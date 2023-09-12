package com.xworkz.dto.app.dto;

public class ApplicationDTO {
	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;
	
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(int id, String name, String developedBy, String developedAt, String version) {
		super();
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
		this.developedAt = developedAt;
		this.version = version;
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getDevelopedAt() {
		return developedAt;
	}

	public void setDevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developedAt="
				+ developedAt + ", version=" + version + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ApplicationDTO) {
				ApplicationDTO applicationDTO=(ApplicationDTO)obj;
				if(applicationDTO.id==id && applicationDTO.name.equals(name) && applicationDTO.developedBy.equals(developedBy) && applicationDTO.developedAt.equals(developedAt) && applicationDTO.version.equals(version)) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}
}
