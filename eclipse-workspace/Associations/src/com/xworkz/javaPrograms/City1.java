package com.xworkz.javaPrograms;

public class City1 {
	
	
	public String name;
	public boolean clean;
	public int pinCode;
	public double areaInSquareKms;
	
	
	
	public City1(String name, boolean clean, int pinCode, double areaInSquareKms) {
		super();
		this.name = name;
		this.clean = clean;
		this.pinCode = pinCode;
		this.areaInSquareKms = areaInSquareKms;
	}
	
	public void showOff1() {
		
		System.out.println(this.name);
		System.out.println(this.clean);
		System.out.println(this.pinCode);
		System.out.println(this.areaInSquareKms);
		
	}
	
	

}
