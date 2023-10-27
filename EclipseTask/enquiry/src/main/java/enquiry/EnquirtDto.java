package enquiry;

public class EnquirtDto {

	private String name;
	private String number;
	private String email;
	private String dob;
	private String location;
	public EnquirtDto(String name, String number, String email, String dob, String location) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.dob = dob;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
