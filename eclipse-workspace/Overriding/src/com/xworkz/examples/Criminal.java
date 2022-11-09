package com.xworkz.examples;

public class Criminal {

	public String name;
	public boolean jail;

	public Criminal(String name, boolean jail) {
		super();
		this.name = name;
		this.jail = jail;

	}

	public void display() {

		System.out.println(this.name);
		System.out.println(this.jail);
	}
}
