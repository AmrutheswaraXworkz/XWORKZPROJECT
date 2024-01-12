package com.xworkz.details.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class BusTicketDTO {

	@NotNull
	@Size(min=3,max=20,message = "Name should be min 3 and max 20")
	private String name;
	@NotNull
	@Size(min=8,max=30,message = "Email should be min 8 and max 30")
	private String email;
	@NotNull
	@Size(min=10,max=10,message = "Mobile number must be 10 numbers")
	private String mobile;
	@NotEmpty(message = "Sorce must not be empty")
	private String source;
	@NotEmpty(message = "Destination must not be empty")
	private String destination;
	private int ticket;
}
