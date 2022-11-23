package com.xworks.examples;

public class Lipstick {
	
	private String brand;
	private String type;
	private String color;
	private int price;
	private boolean good;
	private boolean waterProof;
	private  String itemForm;
	private int noOfShades;
	private String countryOfOrigin;
	private int quantity;
	
	public Lipstick() {
		System.out.println("created default constructor");
	}
	
	
	public Lipstick(String brand, String type, String color, int price, boolean good, boolean waterProof,
			String itemForm, int noOfShades, String countryOfOrigin, int quantity) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
		this.good = good;
		this.waterProof = waterProof;
		this.itemForm = itemForm;
		this.noOfShades = noOfShades;
		this.countryOfOrigin = countryOfOrigin;
		this.quantity = quantity;
	}
	

	public boolean equals(Object obj) {

		if (obj instanceof Lipstick) {
			Lipstick lipstick = (Lipstick) obj;
			if (this.brand.equals(lipstick.brand) && this.type.equals(lipstick.type) && this.color.equals(lipstick.color)
					&& this.itemForm.equals(lipstick.itemForm) && this.countryOfOrigin.equals(lipstick.countryOfOrigin)) {

				System.out.println("All properties are equal");
				return true;

			}

			else {
				System.out.println("These properties are not equal");
			}

		}
		return false;

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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	public boolean isWaterProof() {
		return waterProof;
	}
	public void setWaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}
	public String getItemForm() {
		return itemForm;
	}
	public void setItemForm(String itemForm) {
		this.itemForm = itemForm;
	}
	public int getNoOfShades() {
		return noOfShades;
	}
	public void setNoOfShades(int noOfShades) {
		this.noOfShades = noOfShades;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
