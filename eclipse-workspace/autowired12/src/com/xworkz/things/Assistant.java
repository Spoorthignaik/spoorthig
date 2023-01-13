package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	
	@Autowired
	private  Area area;
	@Autowired
	private Location location;
	@Autowired
	private Company company;
	
	public Assistant() {
		System.out.println("created assistant");
	}

	
	
	

}
