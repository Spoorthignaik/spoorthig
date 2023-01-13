package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity  capacity;
	
	public Battery() {
		System.out.println("created battery");
	}
}
