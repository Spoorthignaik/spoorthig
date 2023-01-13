package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private Experience experience;
	@Autowired
	private Cameraman cameraMan;
	 
	public Movie() {
		System.out.println("created Movie");
	}

}
