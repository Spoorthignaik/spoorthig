package com.xworkz.spoo.dto;

public class BeveragesDto {

	private String name;
	private double price;
	private boolean mrpPrice;
	private String flavours;
	private String location;

	public BeveragesDto() {
		System.out.println("created BeveragesDto");
	}
	
	public BeveragesDto(String name, double price, boolean mrpPrice, String flavours, String location) {
		super();
		this.name = name;
		this.price = price;
		this.mrpPrice = mrpPrice;
		this.flavours = flavours;
		this.location = location;
	}

	@Override
	public String toString() {
		return "BeveragesDto [name=" + name + ", price=" + price + ", mrpPrice=" + mrpPrice + ", flavours=" + flavours
				+ ", location=" + location + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isMrpPrice() {
		return mrpPrice;
	}

	public String getFlavours() {
		return flavours;
	}

	public String getLocation() {
		return location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMrpPrice(boolean mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
