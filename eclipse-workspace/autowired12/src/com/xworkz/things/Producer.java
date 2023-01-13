package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;	
	@Autowired
	private Company company;
	@Autowired
	private Location location;
	@Autowired
	private Area area;
	
	
	public Producer() {
		System.out.println("created producer");
	}

	

}
