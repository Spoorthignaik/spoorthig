package com.xworkz.objects;

public class Pen {
	
	private String name = "pinpoint";
	private int price = 20;
	private boolean dark = true;
	private boolean light = false;
	public double height = 14.5;
	String catridge = "blue";
	String color = "red";
	String brand = "cello";
	String type = "shinig";
	public long barCode = 123455;
	public boolean working = true;
    
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	public boolean isDark() {
		return dark;
	}
	void setDark(boolean dark) {
		this.dark = dark;
	}
	public boolean isLight() {
		return light;
	}
	void setLight(boolean light) {
		this.light = light;
	}
	public double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	public String getCatridge() {
		return catridge;
	}
	 void setCatridge(String catridge) {
		this.catridge = catridge;
	}
	public String getColor() {
		return color;
	}
	 void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	 void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	 void setType(String type) {
		this.type = type;
	}
	public boolean isWorking() {
		return working;
	}
	 public long getBarCode() {
		return barCode;
	}
	void setBarCode(long barCode) {
		this.barCode = barCode;
	}
	void setWorking(boolean working) {
		this.working = working;
	}
	
	
	
	
	

}
