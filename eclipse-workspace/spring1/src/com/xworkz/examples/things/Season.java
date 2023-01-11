package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Season {
	
	private String name;
	private int duration;
	private String startingMonth;
	
	
	public Season() {
		System.out.println("crated default constructor using spring");
	}


	public String getName() {
		return name;
	}


	public int getDuration() {
		return duration;
	}


	public String getStartingMonth() {
		return startingMonth;
	}

    @Value("winter")
	public void setName(String name) {
		this.name = name;
	}

    @Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

    @Value("november")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	
	
}
