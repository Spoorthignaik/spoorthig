package com.xworkz.examples.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class WatchDto {
	
	
	private int id;
	@NotBlank
	private String brand;
	@NotBlank
	private String color;
	@NotNull
	private Double price;
	@NotNull
	private Integer warranty;
	@NotBlank
	private String type;
	
	public WatchDto() {
		System.out.println("created WatchDto");
	}

	public WatchDto(String brand, String color, Double price, Integer warranty, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "WatchDto [brand=" + brand + ", color=" + color + ", price=" + price + ", warranty=" + warranty
				+ ", type=" + type + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getWarranty() {
		return warranty;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
