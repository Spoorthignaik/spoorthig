package com.xworkz.javaPrograms;

public class Country1 {
	
	public String name;
	public String capital;
	public boolean developing;
	public int noOfStates;
	
	public Country1(String name, String capital, boolean developing, int noOfStates) {
		super();
		this.name = name;
		this.capital = capital;
		this.developing = developing;
		this.noOfStates = noOfStates;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.developing);
		System.out.println(this.noOfStates);
	}
	
	

}
