package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;

public class Rubber {
	
	@Autowired
	private String name;
	@Autowired
	private String type;
	@Autowired
	private double price;
	@Autowired
	private String color;
	@Autowired
	private String shape;
	@Autowired
	private boolean stolen;
	@Autowired
	private String size;
	
	public Rubber() {
		System.out.println("created default constructor");
	}
	
	

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getShape() {
		return shape;
	}

	public boolean isStolen() {
		return stolen;
	}

	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setStolen(boolean stolen) {
		this.stolen = stolen;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	

}
