package com.xworkz.examples;

public class Satellite {

	public String name;
	public int launch;

	public Satellite(String name, int launch) {
		super();
		this.name = name;
		this.launch = launch;
	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.launch);

	}

}
