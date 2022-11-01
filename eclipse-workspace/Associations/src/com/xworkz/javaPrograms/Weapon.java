package com.xworkz.javaPrograms;

public class Weapon {
	
	public String name;
	public String use;
	public double weight;
	
	public Weapon(String name, String use, double weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.use);
		System.out.println(this.weight);

	}

}
