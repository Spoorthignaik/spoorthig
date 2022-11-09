package com.xworkz.examples;

public class Ravi extends Criminal {

	public String type;

	public Ravi(String name, boolean jail,String type) {
		super(name, jail);
		this.type=type;
	}
	
	public void display() {
		super.display();
		System.out.println(this.type);
	}
	
}
