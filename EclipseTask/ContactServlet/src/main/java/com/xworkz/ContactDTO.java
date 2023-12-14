package com.xworkz;

public class ContactDTO {

	private String name;
	private String email;
	private String number;
	private String comment;

	public ContactDTO(String name, String email, String number, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ContactDTO [name=" + name + ", email=" + email + ", number=" + number + ", comment=" + comment + "]";
	}

}
