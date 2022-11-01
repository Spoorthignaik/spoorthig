package com.xworkz.javaPrograms;

public class TempleLocation {
	
	
	public String street;
	public String city;
	public String state;
	public int pinCode;
	public String country;

	public TempleLocation(String street, String city, String state, int pinCode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}

	public void showOff() {
		System.out.println(this.street);
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.pinCode);
		System.out.println(this.country);

	}

}
