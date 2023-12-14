package com.xworkz.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{

	private String name;
	private String version;
	private int height;
	private String manufactured;

	public RobotDTO(String name, String version, int height, String manufactured) {
		super();
		this.name = name;
		this.version = version;
		this.height = height;
		this.manufactured = manufactured;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getManufactured() {
		return manufactured;
	}

	public void setManufactured(String manufactured) {
		this.manufactured = manufactured;
	}

	@Override
	public String toString() {
		return "RobotDTO [name=" + name + ", version=" + version + ", height=" + height + ", manufactured="
				+ manufactured + "]";
	}

	@Override
	public int compareTo(RobotDTO arg) {
		RobotDTO robotDTO=this;
		if(robotDTO.height==arg.height) {
			return 0;
		}
		if(robotDTO.height>arg.height) {
			return 1;
		}
		if(robotDTO.height<arg.height) {
			return -1;
		}
		
		throw new IllegalArgumentException("Cant compare!!!");
	}

	
}
