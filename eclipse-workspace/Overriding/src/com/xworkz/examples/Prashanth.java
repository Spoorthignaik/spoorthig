package com.xworkz.examples;

public class Prashanth extends Director {

	public String type;

	public Prashanth(String name, int salary, String type) {
		super(name, salary);
		this.type = type;

	}

	public void display() {
		super.display();
		System.out.println(this.type);

	}

}
