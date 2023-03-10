package com.xworkz.examples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "watch_table")
@NamedQuery(name = "findByType",query = "select ent from WatchEntity ent where ent.type=:typ")
public class WatchEntity {
	
	 @Id
	 @Column(name="w_id")
	private int id;
	 @Column(name="w_brand")
	private String brand;
	 @Column(name="w_color")
	private String color;
	 @Column(name="w_price")
	private Double price;
	 @Column(name="w_warranty")
	private Integer warranty;
	 @Column(name="w_type")
	private String type;
	
	
	
	
	public WatchEntity() {
		System.out.println("created WatchDto");
	}

	public WatchEntity(String brand, String color, Double price, Integer warranty, String type) {
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
