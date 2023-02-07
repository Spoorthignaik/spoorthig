package com.xworkz.spoo.dto;

public class MobileDto {
	
	private String mobileName;
	private String brand;
	private double version;
	private double price;
	private String color;
	private double length;
	private double width;
	private boolean warranty;
	private boolean emi;
	private int warrantyYears;
	
	public MobileDto() {
		System.out.println("running MobileDto ");
	}
	
	public MobileDto(String mobileName, String brand, double version, double price, String color, double length,
			double width, boolean warranty, boolean emi, int warrantyYears) {
		super();
		this.mobileName = mobileName;
		this.brand = brand;
		this.version = version;
		this.price = price;
		this.color = color;
		this.length = length;
		this.width = width;
		this.warranty = warranty;
		this.emi = emi;
		this.warrantyYears = warrantyYears;
	}


	@Override
	public String toString() {
		return "MobileDto [mobileName=" + mobileName + ", brand=" + brand + ", version=" + version + ", price=" + price
				+ ", color=" + color + ", length=" + length + ", width=" + width + ", warranty=" + warranty + ", emi="
				+ emi + ", warrantyYears=" + warrantyYears + "]";
	}


	public String getMobileName() {
		return mobileName;
	}


	public String getBrand() {
		return brand;
	}


	public double getVersion() {
		return version;
	}


	public double getPrice() {
		return price;
	}


	public String getColor() {
		return color;
	}


	public double getLength() {
		return length;
	}


	public double getWidth() {
		return width;
	}


	public boolean isWarranty() {
		return warranty;
	}


	public boolean isEmi() {
		return emi;
	}


	public int getWarrantyYears() {
		return warrantyYears;
	}


	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}


	public void setEmi(boolean emi) {
		this.emi = emi;
	}


	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	
	

}
