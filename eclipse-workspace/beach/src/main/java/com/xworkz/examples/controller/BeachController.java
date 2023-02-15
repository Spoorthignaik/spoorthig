package com.xworkz.examples.controller;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.examples.dto.BeachDto;

@Component
@RequestMapping("/beach")
public class BeachController {
	
	public BeachController() {
		System.out.println("created BeachController ");
	}
	
	@PostMapping
	public String onBeach (BeachDto beachDto,Model model) {
		System.out.println("running onBeach "+beachDto);
	    model.addAttribute("Name",beachDto.getName());
	    model.addAttribute("location",beachDto.getLocation());
	    model.addAttribute("games",beachDto.getGames());
	    model.addAttribute("Clean",beachDto.isClean());
		return "BeachSuccess.jsp ";
	}

}
