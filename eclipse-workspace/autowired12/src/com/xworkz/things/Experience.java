package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {

	@Autowired
	private Skills skills;
	
	public Experience() {
		System.out.println("created experienc");
	}
}
