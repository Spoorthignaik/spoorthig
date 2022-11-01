package com.xworkz.javaPrograms;

import com.xworkz.javaPrograms.Constants.Shape;

public class Pillars {

	public int id;
	public String place;
	public Shape shape;
	public double height;
	public boolean supporting;
	public Company company = new Company();

	public Pillars() {

	}

	public Pillars(int id, String place, Shape shape2, double height, boolean supporting) {
		super();
		this.id = id;
		this.place = place;
		this.shape = shape2;
		this.height = height;
		this.supporting = supporting;

		if (company != null) {

			this.company.piller();
		} else {
			System.out.println("running company");
		}
	}

	public void show() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.height);
		System.out.println(this.height);
		System.out.println(this.supporting);
		System.out.println(this.shape);
		company.showOff();
	}

}
