package com.xworkz.saloon.configuration.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SaloonApplication {

	public SaloonApplication() {
		System.out.println("Saloon Application");
	}

	@RequestMapping("/test")
	public String onSave(Model model, @RequestParam("barbarName") String barbarName, @RequestParam("date") String date,
			@RequestParam("time") String time, @RequestParam("email") String email,
			@RequestParam("location") String location, @RequestParam("mobileNumber") String mobileNumber,
			@RequestParam("purpose") String purpose, @RequestParam("age") String age,
			@RequestParam("gender") String gender, @RequestParam("member") String member,
			@RequestParam("payment") String payment) {
		model.addAttribute("msg", "saved succesfully");
		System.out.println("barbar name:"+barbarName);
		System.out.println("date:"+date);
		System.out.println("time:"+time);
		System.out.println("email:"+email);
		System.out.println("location:"+location);
		System.out.println("age:"+age);
		System.out.println("mobileNumber:"+mobileNumber);
		System.out.println("gender:"+gender);
		System.out.println("member:"+member);
		System.out.println("payment:"+payment);
		System.out.println("invoked on save");
		return "index.jsp";
	}
}
