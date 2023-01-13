package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cameraman {
	
	@Autowired
	private Camera camera;
	
	public Cameraman() {
		System.out.println("created cameraman");
	}

}
