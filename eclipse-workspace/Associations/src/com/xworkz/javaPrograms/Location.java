package com.xworkz.javaPrograms;

public class Location {

	public int no;
	public String street;
	public City1 city1;
	public State state;
	public Country1 country1;

	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}

	public void setCity1(City1 city1) {

		this.city1 = city1;

	}

	public void setState(State state) {

		this.state = state;

	}

	public void setCountry(Country1 country1) {

		this.country1 = country1;
	}

	public void showOff3() {
		System.out.println(this.no);
		System.out.println(this.street);
		if (this.city1 != null) {
			System.out.println(" ------------");
			this.city1.showOff1();

		} else {
          System.out.println("not running");
		}
		
		
		if (this.country1 != null) {
			System.out.println(" ------------");
			this.country1.showOff();

		} else {
			System.out.println("not running");
		}

		
		if (this.state != null) {
			System.out.println(" ------------");
			this.state.showOff2();

		} else {
			System.out.println("not running");
		}

	}

}
