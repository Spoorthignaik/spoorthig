package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Software {

	
	@Autowired
	private String name;
	@Autowired
	private int version;
	@Autowired
	private boolean developer;
	@Autowired
	private int date;
	@Autowired
	private boolean free;
	
	
	
	public Software() {
		System.out.println("created default constructor");
	}



	public String getName() {
		return name;
	}



	public int getVersion() {
		return version;
	}



	public boolean isDeveloper() {
		return developer;
	}



	public int getDate() {
		return date;
	}



	public boolean isFree() {
		return free;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public void setDeveloper(boolean developer) {
		this.developer = developer;
	}



	public void setDate(int date) {
		this.date = date;
	}



	public void setFree(boolean free) {
		this.free = free;
	}
	
	
	
	
}
