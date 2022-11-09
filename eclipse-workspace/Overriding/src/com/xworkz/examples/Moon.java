package com.xworkz.examples;

public class Moon extends Satellite{
	
	public String color;

	public Moon(String name, int launch,String color) {
		super(name, launch);
		this.color=color;
	
	}
	public void display() {
		super.display();
		System.out.println(this.color);
	}

}
