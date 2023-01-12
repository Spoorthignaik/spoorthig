package com.xworkz.example.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private String type;
	private boolean poisonous;
	
	@Autowired
	public Snake(@Qualifier("snakeName")  String name, double length, String color,@Qualifier("snakeType")  String type,@Qualifier("snakePoisen") boolean poisonous) {
		super();
		this.name = name;
		this.length = length;
		this.color = color;
		this.type = type;
		this.poisonous = poisonous;
	}


	public String getName() {
		return name;
	}


	public double getLength() {
		return length;
	}


	public String getColor() {
		return color;
	}


	public String getType() {
		return type;
	}


	public boolean isPoisonous() {
		return poisonous;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}
	
	
	
	
	
	

}
