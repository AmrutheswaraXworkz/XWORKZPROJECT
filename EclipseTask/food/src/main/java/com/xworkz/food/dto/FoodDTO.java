package com.xworkz.food.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FoodDTO {

	@NotNull
	@Size(min=3,max=20,message = "name must be min 3 and max 20")
	private String name;
	@NotNull
	@Size(min=3,max=20,message = "name must be min 3 and max 20")
	private String color;
	@Min(0)
	@Max(5)
	private Integer rating;
	@NotNull
	@Size(min=3,max=20,message = "name must be min 3 and max 20")
	private String state;
	
}
