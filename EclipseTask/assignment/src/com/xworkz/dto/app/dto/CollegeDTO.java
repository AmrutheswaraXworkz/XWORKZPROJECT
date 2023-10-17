package com.xworkz.dto.app.dto;

public class CollegeDTO {
	
	private String cName;
	private int cId;
	private String address;
	private long phoneNo;
	private String website;
	private String email;
	private int dept;
	private int faculty;
	private int year;
	private String type;
	private String country;
	private String state;
	private float size;
	private int noBuildings;
	private boolean sports;
	private float libSize;
	private boolean computer;
	private int compLabs;
	private boolean parking;
	private float fee;
	private int rank;
	
	
	public CollegeDTO() {
		// TODO Auto-generated constructor stub
	}


	public CollegeDTO(String cName, int cId, String address, long phoneNo, String website, String email, int dept,
			int faculty, int year, String type, String country, String state, float size, int noBuildings,
			boolean sports, float libSize, boolean computer, int compLabs, boolean parking, float fee, int rank) {
		super();
		this.cName = cName;
		this.cId = cId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.website = website;
		this.email = email;
		this.dept = dept;
		this.faculty = faculty;
		this.year = year;
		this.type = type;
		this.country = country;
		this.state = state;
		this.size = size;
		this.noBuildings = noBuildings;
		this.sports = sports;
		this.libSize = libSize;
		this.computer = computer;
		this.compLabs = compLabs;
		this.parking = parking;
		this.fee = fee;
		this.rank = rank;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getDept() {
		return dept;
	}


	public void setDept(int dept) {
		this.dept = dept;
	}


	public int getFaculty() {
		return faculty;
	}


	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public float getSize() {
		return size;
	}


	public void setSize(float size) {
		this.size = size;
	}


	public int getNoBuildings() {
		return noBuildings;
	}


	public void setNoBuildings(int noBuildings) {
		this.noBuildings = noBuildings;
	}


	public boolean isSports() {
		return sports;
	}


	public void setSports(boolean sports) {
		this.sports = sports;
	}


	public float getLibSize() {
		return libSize;
	}


	public void setLibSize(float libSize) {
		this.libSize = libSize;
	}


	public boolean isComputer() {
		return computer;
	}


	public void setComputer(boolean computer) {
		this.computer = computer;
	}


	public int getCompLabs() {
		return compLabs;
	}


	public void setCompLabs(int compLabs) {
		this.compLabs = compLabs;
	}


	public boolean isParking() {
		return parking;
	}


	public void setParking(boolean parking) {
		this.parking = parking;
	}


	public float getFee() {
		return fee;
	}


	public void setFee(float fee) {
		this.fee = fee;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "CollegeDTO [cName=" + cName + ", cId=" + cId + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", website=" + website + ", email=" + email + ", dept=" + dept + ", faculty=" + faculty + ", year="
				+ year + ", type=" + type + ", country=" + country + ", state=" + state + ", size=" + size
				+ ", noBuildings=" + noBuildings + ", sports=" + sports + ", libSize=" + libSize + ", computer="
				+ computer + ", compLabs=" + compLabs + ", parking=" + parking + ", fee=" + fee + ", rank=" + rank
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CollegeDTO) {
				CollegeDTO collegeDto=(CollegeDTO)obj;
				if(collegeDto.cId==cId && collegeDto.cName.equals(cName) &&  collegeDto.phoneNo==phoneNo && 
						collegeDto.website.equals(website)&& collegeDto.email.equals(email) && collegeDto.faculty==faculty
						) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}
	

}
