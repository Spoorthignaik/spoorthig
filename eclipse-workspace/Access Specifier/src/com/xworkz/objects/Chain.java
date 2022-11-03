package com.xworkz.objects;

public class Chain {

	public String type = "open type";
	public int price = 300;
	public double length = 600.5;
	private String material = "threaded";
	private double weight = 67.8;
	public boolean stolen = true;
	private boolean fresh = true;
	String usedFor = "dog";
	String brand = "PSK pet mart";
	boolean round = true;
	public boolean old = false;
	
	public String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
	public double getLength() {
		return length;
	}
	 void setLength(double length) {
		this.length = length;
	}
	public String getMaterial() {
		return material;
	}
	 void setMaterial(String material) {
		this.material = material;
	}
	public double getWeight() {
		return weight;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isStolen() {
		return stolen;
	}
	 void setStolen(boolean stolen) {
		this.stolen = stolen;
	}
	public boolean isFresh() {
		return fresh;
	}
	 void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public String getUsedFor() {
		return usedFor;
	}
	 void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}
	public String getBrand() {
		return brand;
	}
	 void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isRound() {
		return round;
	}
	 void setRound(boolean round) {
		this.round = round;
	}
	public boolean isOld() {
		return old;
	}
	void setOld(boolean old) {
		this.old = old;
	}
	
	

}
