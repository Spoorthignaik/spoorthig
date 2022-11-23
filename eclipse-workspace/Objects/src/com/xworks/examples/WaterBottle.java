package com.xworks.examples;

public class WaterBottle {
	
	private String name;
	private String brand;
	private int price;
	private String color;
	private String material;
	private double weight;
	private double capacity;
	private String type;
	private String Model;
	private boolean good;
	
	public WaterBottle() {
		System.out.println("created default constructor");
	}
	
	public WaterBottle(String name, String brand, int price, String color, String material, double weight,
			double capacity, String type, String model, boolean good) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.material = material;
		this.weight = weight;
		this.capacity = capacity;
		this.type = type;
		this.Model = model;
		this.good = good;
	}

	
	
	@Override
	public String toString() {
		return "WaterBottle [name=" + name + ", brand=" + brand + ", price=" + price + ", color=" + color
				+ ", material=" + material + ", weight=" + weight + ", capacity=" + capacity + ", type=" + type
				+ ", Model=" + Model + ", good=" + good + ", getName()=" + getName() + ", getBrand()=" + getBrand()
				+ ", getPrice()=" + getPrice() + ", getColor()=" + getColor() + ", getMaterial()=" + getMaterial()
				+ ", getWeight()=" + getWeight() + ", getCapacity()=" + getCapacity() + ", getType()=" + getType()
				+ ", getModel()=" + getModel() + ", isGood()=" + isGood() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean equals(Object obj) {

		if (obj instanceof WaterBottle) {
			WaterBottle water = (WaterBottle) obj;
			if (this.name.equals(water.name) && this.color.equals(water.color)&&this.material.equals(water.material)) {

				System.out.println("name color and material properties are equal");
				return true;

			}

			else {
				System.out.println("These properties are not equal");
			}

		}
		return false;

	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	

}
