package com.xworkz.examples;

public class OrionMall extends ShoppingMall {

	public String location;

	public OrionMall(int noOfFloors, boolean elevator, String location) {
		super(noOfFloors, elevator);
		this.location = location;
	}

	public void display() {

		super.display();
		System.out.println(this.location);
	}
}
