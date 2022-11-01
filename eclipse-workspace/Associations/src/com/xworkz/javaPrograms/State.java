package com.xworkz.javaPrograms;

public class State {
	
	public String name;
	public int noOfDistricts;
	public String capital;
	public String oldName ;
	
	
	
	public State(String name, int noOfDistricts, String capital, String oldName) {
		super();
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.capital = capital;
		this.oldName = oldName;
	}
	
	public void showOff2() {
		System.out.println(this.name);
		System.out.println(this.noOfDistricts);
		System.out.println(this.capital);
		System.out.println(this.oldName);
		
	}
	
	

}
