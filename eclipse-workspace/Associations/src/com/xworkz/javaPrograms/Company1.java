package com.xworkz.javaPrograms;

public class Company1 {
	
	public String name;
	public String ownerName;
	public Address address;
	
	
	public Company1(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public void setAddress(Address address) {

		this.address = address;

	}

	public void showOff5() {

		if (this.address != null) {
			System.out.println(" ------------");
			this.address.showOff4();

		} else {
			System.out.println("not running address");
		}

	}

}
