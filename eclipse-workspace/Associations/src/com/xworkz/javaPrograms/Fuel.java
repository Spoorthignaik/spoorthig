package com.xworkz.javaPrograms;
	
public class Fuel {

	
	public Brand brand=new Brand();
	public boolean special;
	public String type;
	public int price;
	public double quantity;
	
	
	
	public Fuel( boolean special, String type, int price, double quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public void machine() {

		System.out.println("invoking machine");

	}
	
	public void poll() {
		System.out.println("invoking poll");
	}
	
	public void display() {
	System.out.println(this.special);	
	System.out.println(this.type);	
	System.out.println(this.price);
	System.out.println(this.quantity);
	
		
	}
	
	
	
	
}
