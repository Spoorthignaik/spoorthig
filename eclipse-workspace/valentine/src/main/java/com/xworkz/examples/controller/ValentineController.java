package com.xworkz.examples.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.jws.WebParam.Mode;
import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.examples.dto.ValentineDto;
import com.xworkz.examples.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {
	
	@Autowired
	private ValentineService valentineService;
	
	private List<String>places=Arrays.asList("cubbon park","Lal bagh","BTM","JP nagar","shivamogga");
	private List<String>gifts=Arrays.asList("Teddy","Chocolate","I-phone","saree");
	
	public ValentineController() {
		System.out.println("running ValentineController ");
	}
	
	@GetMapping
	public String onValentine(Model model) {
		System.out.println("running onValentine");
		List<String>places=Arrays.asList("cubbon park","Lal bagh","BTM","JP nagar","shivamogga");
	   List<String>gifts=Arrays.asList("Teddy","Chocolate","I-phone","saree");
	   model.addAttribute("places",places);
		model.addAttribute("gifts",gifts);
		
		return "Valentine";
	}
	
	@PostMapping
	public String onValentine(Model model,ValentineDto dto) {
		System.out.println("running onValentine post method "+dto);
		
		Set<ConstraintViolation<ValentineDto>>violations=this.valentineService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("no violations in controller go to success page");
			return "ValentineSuccess";
		}
		
		
		model.addAttribute("places",places);
		model.addAttribute("gifts",gifts);
		model.addAttribute("errors",violations);
	    model.addAttribute("dto",dto);
		System.out.println("violation in controller");
		return "Valentine";
		
	}
	

}
