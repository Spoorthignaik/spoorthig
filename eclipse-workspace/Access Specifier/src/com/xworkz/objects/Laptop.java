package com.xworkz.objects;

public class Laptop {

	private String name = "dell";
	private String brand = "dell1";
	private long price = 56699;
	public String color = "grey";
	public boolean old = true;
	String type = "netbook";
	boolean working = true;
	String usedFor = "games";
	public boolean trending = true;
	private boolean best = true;
	public boolean electric = true;

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
	public boolean isOld() {
		return old;
	}
	 void setOld(boolean old) {
		this.old = old;
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
