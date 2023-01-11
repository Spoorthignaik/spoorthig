package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("india")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("5678799L")
	private long budget;
	
	
	public Rocket() {
		System.out.println("created Rocket using default constructor by spring");
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getBudget() {
		return budget;
	}


	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	
	

}
