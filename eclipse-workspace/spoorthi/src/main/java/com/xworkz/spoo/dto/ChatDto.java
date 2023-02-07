package com.xworkz.spoo.dto;

public class ChatDto {

	private String chatName;
	private double price;
	private boolean tasty;
	private boolean spicy;
	private String variety;
	private String color;
	private String shopName;
	private long contactNo;
	private boolean good;
	private String location;
	private String area;

	
	public ChatDto() {
		System.out.println("running chat dto");
	}
	
	
	
	
	public ChatDto(String chatName, double price, boolean tasty, boolean spicy, String variety, String color,
			String shopName, long contactNo, boolean good, String location, String area) {
		super();
		this.chatName = chatName;
		this.price = price;
		this.tasty = tasty;
		this.spicy = spicy;
		this.variety = variety;
		this.color = color;
		this.shopName = shopName;
		this.contactNo = contactNo;
		this.good = good;
		this.location = location;
		this.area = area;
	}

	@Override
	public String toString() {
		return "ChatDto [chatName=" + chatName + ", price=" + price + ", tasty=" + tasty + ", spicy=" + spicy
				+ ", variety=" + variety + ", color=" + color + ", shopName=" + shopName + ", contactNo=" + contactNo
				+ ", good=" + good + ", location=" + location + ", area=" + area + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getChatName() {
		return chatName;
	}

	public double getPrice() {
		return price;
	}

	public boolean isTasty() {
		return tasty;
	}

	public boolean isSpicy() {
		return spicy;
	}

	public String getVariety() {
		return variety;
	}

	public String getColor() {
		return color;
	}

	public String getShopName() {
		return shopName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public boolean isGood() {
		return good;
	}

	public String getLocation() {
		return location;
	}

	public String getArea() {
		return area;
	}

	public void setChatName(String chatName) {
		this.chatName = chatName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
