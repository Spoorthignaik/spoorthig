package com.xworks.examples;

public class Vehicle {

	private String name;
	private String brand;
	private String type;
	private double price;
	private String usedFor;
	private boolean fast;
	private String color;
	private String material;
	private double model;
	private boolean batteryRequired;

	public Vehicle() {
		System.out.println("created default constructor");
	}

	public Vehicle(String name, String brand, String type, double price, String usedFor, boolean fast, String color,
			String material, double model, boolean batteryRequired) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.usedFor = usedFor;
		this.fast = fast;
		this.color = color;
		this.material = material;
		this.model = model;
		this.batteryRequired = batteryRequired;

	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", type=" + type + ", price=" + price + ", usedFor="
				+ usedFor + ", fast=" + fast + ", color=" + color + ", material=" + material + ", model=" + model
				+ ", batteryRequired=" + batteryRequired + ", getName()=" + getName() + ", getBrand()=" + getBrand()
				+ ", getType()=" + getType() + ", getPrice()=" + getPrice() + ", getUsedFor()=" + getUsedFor()
				+ ", isFast()=" + isFast() + ", getColor()=" + getColor() + ", getMaterial()=" + getMaterial()
				+ ", getModel()=" + getModel() + ", isBatteryRequired()=" + isBatteryRequired() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean equals(Object obj) {

		if (obj instanceof Vehicle) {
			Vehicle vehicle = (Vehicle) obj;
			if (this.name.equals(vehicle.name) && this.color.equals(vehicle.color)) {

				System.out.println("name and color properties are equal");
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public boolean isFast() {
		return fast;
	}

	public void setFast(boolean fast) {
		this.fast = fast;
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

	public double getModel() {
		return model;
	}

	public void setModel(double model) {
		this.model = model;
	}

	public boolean isBatteryRequired() {
		return batteryRequired;
	}

	public void setBatteryRequired(boolean batteryRequired) {
		this.batteryRequired = batteryRequired;
	}

}
