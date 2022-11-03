package com.xworkz.objects;

public class Pant {

	String name = "leggins";
	String type = "readyMade";
	public boolean quality = true;
	public int price = 300;
	public boolean fit = true;
	public boolean pockets = true;
	private String patterns = "plain";
	private String color = "orange";
	private String brand = "denim";
	public boolean old = true;
	public boolean fashionable = true;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	public boolean isQuality() {
		return quality;
	}
	void setQuality(boolean quality) {
		this.quality = quality;
	}
	public int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
	public boolean isFit() {
		return fit;
	}
	 void setFit(boolean fit) {
		this.fit = fit;
	}
	public boolean isPockets() {
		return pockets;
	}
	 void setPockets(boolean pockets) {
		this.pockets = pockets;
	}
	public String getPatterns() {
		return patterns;
	}
	void setPatterns(String patterns) {
		this.patterns = patterns;
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
	public boolean isOld() {
		return old;
	}
	void setOld(boolean old) {
		this.old = old;
	}
	public boolean isFashionable() {
		return fashionable;
	}
    void setFashionable(boolean fashionable) {
		this.fashionable = fashionable;
	}

}
