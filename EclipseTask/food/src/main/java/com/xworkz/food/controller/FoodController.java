package com.xworkz.food.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.food.dto.FoodDTO;



@EnableWebMvc
@Controller
@RequestMapping("/")
public class FoodController {
	
	public FoodController() {
		System.out.println("FoodController is called");
	}
	@RequestMapping("/food")
	public String saveFood(Model model,@Valid FoodDTO dto,BindingResult errors) {
		
		System.out.println("Details of the dto is:"+dto);
		System.out.println("Details of foodDto is valid:"+errors.hasErrors());
		model.addAttribute("dto", dto);
		
		if(errors.hasErrors()) {
			List<ObjectError> objectErrors=errors.getAllErrors();
			objectErrors.forEach(a->System.out.println(a.getObjectName()+" "+a.getDefaultMessage()));
			model.addAttribute("error",objectErrors);
			model.addAttribute("err", "details cannot be saved");
			System.out.println("error");
			
			return "index.jsp";
			
		}else {
			System.out.println("Saved:");
			model.addAttribute("noError", "Details saved");
			System.out.println("data are:"+dto);
			
			return "FoodSuccess.jsp";
		}
		
	}

}
