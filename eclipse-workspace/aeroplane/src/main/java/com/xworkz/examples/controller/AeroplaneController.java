package com.xworkz.examples.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.examples.dto.AeroplaneDto;
import com.xworkz.examples.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {
  
	@Autowired
	private AeroplaneService aeroplaneService;
	
   private List<String>type=Arrays.asList("Cargo","Military","Gliders","MicroLights");
   private	List<String>country=Arrays.asList("India","China","America","Sydney","Paris");
	
	public AeroplaneController() {
		System.out.println("created AeroplaneController");
	}
	
	@GetMapping("/plane")
	public String onAeroplane(Model model) {
		System.out.println("running onAeroplane");
		List<String>type=Arrays.asList("Cargo","Military","Gliders","MicroLights");
		List<String>country=Arrays.asList("India","China","America","Sydney","Paris");
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		return "Aeroplane";
	}
	
	@PostMapping("/plane")
	public String onAeroplane(AeroplaneDto dto,Model model) {
		System.out.println("running onAeroplane in dto "+dto);
		
		Set<ConstraintViolation<AeroplaneDto>>violations=this.aeroplaneService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("no violations in controller");
			model.addAttribute("same","validation success");
			return "Aeroplane";
		}
		
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		model.addAttribute("errors",violations);
	    model.addAttribute("dto",dto);
		System.out.println("violation in controller");
		return "Aeroplane";
		
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("running on search for id "+id);
		
		AeroplaneDto dto=this.aeroplaneService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}
		else {
			model.addAttribute("message","Data not found");
			
		}
		return "AeroplaneSearch";
	}
	
}
