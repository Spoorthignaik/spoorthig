package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pencil {
	
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	private Double price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private Boolean sharp;
	@Autowired
	@Qualifier("stolen")
	private Boolean stolen;
	
	
	public Pencil() {
		System.out.println("created default constructor");
	}


	public String getName() {
		return name;
	}


	public String getType() {
		return type;
	}


	public Double getPrice() {
		return price;
	}


	public String getColor() {
		return color;
	}


	public Boolean getSharp() {
		return sharp;
	}


	public Boolean getStolen() {
		return stolen;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setSharp(Boolean sharp) {
		this.sharp = sharp;
	}


	public void setStolen(Boolean stolen) {
		this.stolen = stolen;
	}
	
	
	
	

}
