package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class SoftwareEngineer {
	@Autowired
	private String name;
	@Autowired
	private double salary;
	@Autowired
	private String companyName;
	@Autowired
	private double expirience;
	
	public SoftwareEngineer() {
		System.out.println("created default constructor");
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getExpirience() {
		return expirience;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setExpirience(double expirience) {
		this.expirience = expirience;
	}

	
	
}
