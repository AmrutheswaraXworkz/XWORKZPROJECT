package com.xworkz.details.config.comp;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.details.dto.BloodBankDTO;
import com.xworkz.details.dto.BusTicketDTO;

@Component
@RequestMapping("/")
public class DetailsApplication {

	public DetailsApplication() {
		System.out.println("Created DetailsApplication");
	}

	@RequestMapping("/detail")
	public String saved(Model model, @RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("age") String age, @RequestParam("city") String city,
			@RequestParam("district") String district, @RequestParam("state") String state,
			@RequestParam("country") String country,@RequestParam("pincode") String pincode) {

		model.addAttribute("msg", "Succesfully Saved");
		System.out.println("Name:"+name);
		System.out.println("email:"+email);
		System.out.println("age:"+age);
		System.out.println("city:"+city);
		System.out.println("state:"+state);
		System.out.println("district:"+district);
		System.out.println("country:"+country);
		System.out.println("pincode:"+pincode);
		return "Details.jsp";
	}
	@RequestMapping("/blood")
	public String savedBlood(Model model,BloodBankDTO dto) {
		model.addAttribute("msg", "Succesfully saved the details of donor");
		System.out.println("saved the details of blood donor:"+dto);
		
		return "Blood.jsp";
	}
	
	@RequestMapping("/bus")
		public String savedTicket(Model model,@Valid BusTicketDTO dto,BindingResult errors) {
			
			System.out.println("Bus Ticket details are Saaved!!!"+dto);
			System.out.println("Bus Ticket details dto is In Valid:"+errors.hasErrors());
			List<ObjectError> error=errors.getAllErrors();
			error.forEach(e->System.out.println(e.getObjectName()+":message:"+e.getDefaultMessage()));
			if(errors.hasErrors()) {
				model.addAttribute("msg", "Didnt saved :(");
				return "BusTicket";
			}else {
			model.addAttribute("msg", "Succesfully Saved!!");
			return "BusTicket";
			}
		}
	}

