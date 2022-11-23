package com.xworks.examples;

public class Paint {
	
	
	private String name;
	private String brand;
	private int price;
	private boolean quality;
	private String suitableFor;
	private boolean shining;
	private String color;
	private int quantity;
	private String type;
	private String applicationType;
	
	
	
	
	public Paint() {
		System.out.println("created by default");
	}
	
	
	public Paint(String name, String brand, int price, boolean quality, String suitableFor, boolean shining,
			String color, int quantity, String type, String applicationType) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quality = quality;
		this.suitableFor = suitableFor;
		this.shining = shining;
		this.color = color;
		this.quantity = quantity;
		this.type = type;
		this.applicationType = applicationType;
		
		
	
		
		
	}
	@Override
	public String toString() {
		return "Paint [name=" + name + ", brand=" + brand + ", price=" + price + ", quality=" + quality
				+ ", suitableFor=" + suitableFor + ", shining=" + shining + ", color=" + color + ", quantity="
				+ quantity + ", type=" + type + ", applicationType=" + applicationType + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running method");
		if(obj instanceof Paint) {
			System.out.println("check the properties");
			Paint paint=(Paint)obj;
			if(this.brand.equals(paint.brand)) {
				System.out.println("brand is same");
				return true;
			}
			else {
				System.out.println("obj is not paint");
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
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public String getSuitableFor() {
		return suitableFor;
	}
	public void setSuitableFor(String suitableFor) {
		this.suitableFor = suitableFor;
	}
	public boolean isShining() {
		return shining;
	}
	public void setShining(boolean shining) {
		this.shining = shining;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	

}
