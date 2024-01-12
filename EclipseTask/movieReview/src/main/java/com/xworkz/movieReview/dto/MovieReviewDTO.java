package com.xworkz.movieReview.dto;

import lombok.Data;

@Data
public class MovieReviewDTO {

	private String name;
	private String director;
	private String leadActor;
	private String leadActress;
	private int rating;
}
