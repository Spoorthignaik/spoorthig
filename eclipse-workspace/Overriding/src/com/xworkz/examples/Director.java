package com.xworkz.examples;

public class Director {
	
	public String name;
	public int salary;
	
	public Director(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.salary);
		
		
		
	}
}
