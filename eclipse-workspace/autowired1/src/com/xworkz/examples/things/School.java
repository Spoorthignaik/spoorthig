package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	@Qualifier("location")
	private String location;
	@Autowired
	@Qualifier("language")
	private String language;
	@Autowired
	@Qualifier("noOfStudents")
	private int noOfStudeents;
	@Autowired
	@Qualifier("contactNo")
	private long contactNo;
	@Autowired
	@Qualifier("noOfStaffs")
	private int noOfStaffs;
	@Autowired
	@Qualifier("primary")
	private boolean primary;
	@Autowired
	@Qualifier("good")
	private boolean good;
	
	public School() {
		System.out.println("created default constructor");
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public String getLanguage() {
		return language;
	}

	public int getNoOfStudeents() {
		return noOfStudeents;
	}

	public long getContactNo() {
		return contactNo;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public boolean isPrimary() {
		return primary;
	}

	public boolean isGood() {
		return good;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setNoOfStudeents(int noOfStudeents) {
		this.noOfStudeents = noOfStudeents;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public void setGood(boolean good) {
		this.good = good;
	}
	
	
	

}
