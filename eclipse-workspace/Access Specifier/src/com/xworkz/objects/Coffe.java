package com.xworkz.objects;

public class Coffe {

	private String name = "cappucinos";
	public boolean tasty = true;
	public boolean good = false;
	private int barCode = 67488;
	private String calories = "large";
	private boolean sweet = true;
	public int price = 500;
	String color = "brown";
	String type = "normal`";
	String brand = "starBucks";
	public String ingredient = "";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public boolean isTasty() {
		return tasty;
	}

	void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	public boolean isGood() {
		return good;
	}

	void setGood(boolean good) {
		this.good = good;
	}

	public int getBarCode() {
		return barCode;
	}

	void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getCalories() {
		return calories;
	}

	void setCalories(String calories) {
		this.calories = calories;
	}

	public boolean isSweet() {
		return sweet;
	}

	void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	 void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	public String getIngredient() {
		return ingredient;
	}
	 void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	
}
