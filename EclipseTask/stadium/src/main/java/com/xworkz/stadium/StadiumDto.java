package com.xworkz.stadium;

public class StadiumDto {

	private String name;
	private String host;
	private String date;
	private String team1;
	private String team2;
	private String captain1;
	private String captain2;
	private String umpire;
	private String stadium;
	private String umpire3;
	private String capacity;

	public StadiumDto(String name, String host, String date, String team1, String team2, String captain1,
			String captain2, String umpire, String stadium, String umpire3, String capacity) {
		super();
		this.name = name;
		this.host = host;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.captain1 = captain1;
		this.captain2 = captain2;
		this.umpire = umpire;
		this.stadium = stadium;
		this.umpire3 = umpire3;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getCaptain1() {
		return captain1;
	}

	public void setCaptain1(String captain1) {
		this.captain1 = captain1;
	}

	public String getCaptain2() {
		return captain2;
	}

	public void setCaptain2(String captain2) {
		this.captain2 = captain2;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getUmpire3() {
		return umpire3;
	}

	public void setUmpire3(String umpire3) {
		this.umpire3 = umpire3;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
