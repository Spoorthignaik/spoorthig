package com.xworkz.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.examples.dto.EggDto;
import com.xworkz.examples.service.EggService;


@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	private EggService eggService;
	
	public EggController() {
		System.out.println("running EggController");
	}
	
	@PostMapping
	public String onOrder(EggDto dto,Model model) {
		System.out.println("running onOrder"+dto);
		boolean saved=this.eggService.validateAndSave(dto);
		System.out.println("saved:"+saved);
		return "index";
	}

}
