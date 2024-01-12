package com.xworkz.movieReview.config.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.movieReview.dto.MovieReviewDTO;

@Component
@RequestMapping("/")
public class MovieReviewApplication {

	public MovieReviewApplication() {
		System.out.println("Created MovieReviewApplication");
	}
	@RequestMapping("/rating")
	public String saveRating(Model model,MovieReviewDTO dto) {
		model.addAttribute("msg", "Rating saved succesfully");
		System.out.println("Details are:"+dto);
		
		return "Rating";
	}
}
