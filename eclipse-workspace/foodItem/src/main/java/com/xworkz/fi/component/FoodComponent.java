package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodComponent {

	public FoodComponent() {
		System.out.println("createtd FoodComponent");
	}
	
	@PostMapping 	
	public String onSend(@RequestParam String name ,@RequestParam int price,@RequestParam int quantity,@RequestParam String type) {
		System.out.println("running on send post ");
		System.out.println("food name is "+name);
		System.out.println("food price is "+price);
		System.out.println("food quantity is "+quantity);
		System.out.println("food type is "+type);
		
		
		
		return "Food.jsp";
	}
	
}
