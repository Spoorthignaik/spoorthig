package com.xworkz.objects;

public class Car {

	private String name = "XUV500";
	public String brand = "mahindra";
	private long price = 45679;
	private String color = "black";
	public boolean numberPlate = true;
	private String fuelType = "diesel";
	public boolean working = true;
	String usedFor = "travelling";
	boolean trending = true;
	public boolean best = true;
	public boolean electric = false;
	
	public String getName() {
		return name;
	}
     void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	void setPrice(long price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	public boolean isNumberPlate() {
		return numberPlate;
	}
	 void setNumberPlate(boolean numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public boolean isWorking() {
		return working;
	}
	 void setWorking(boolean working) {
		this.working = working;
	}
	public String getUsedFor() {
		return usedFor;
	}
	void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}
	public boolean isTrending() {
		return trending;
	}
	void setTrending(boolean trending) {
		this.trending = trending;
	}
	public boolean isBest() {
		return best;
	}
	void setBest(boolean best) {
		this.best = best;
	}
	public boolean isElectric() {
		return electric;
	}
	void setElectric(boolean electric) {
		this.electric = electric;
	}
	

}
