package com.xworkz.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.example.dto.BakeryDto;
import com.xworkz.example.service.BakeryService;

@Controller
@RequestMapping("/bake")
public class BakeryController {
	
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("created BakeryController ");
	}
	
	
	@PostMapping
	public String onBakery(BakeryDto bakeryDto,Model model) {
		System.out.println("running bakery"+bakeryDto);
		
		model.addAttribute("name",bakeryDto.getName());
		model.addAttribute("ownerName",bakeryDto.getOwnerName());
		model.addAttribute("wife",bakeryDto.getWife());
		model.addAttribute("married",bakeryDto.isMarried());
		model.addAttribute("famous",bakeryDto.isFamous());
		model.addAttribute("since",bakeryDto.getSince());
		
		
		boolean saved=this.bakeryService.validateAndSave(bakeryDto);
		System.out.println("saved "+saved);
		
		
		return "BakerySuccess.jsp";
	}
	
	
}
