package com.xworkz.javaPrograms;

public class Address {
	
	public Location location;
	
	public void setLocation(Location location) {
		this.location=location;
		
	}
	
	
  public void showOff4() {
	

		if (location != null) {
			System.out.println(" ------------");
			this.location.showOff3();

		} else {
			System.out.println("not running location");
		}
	
}
}
