package com.xworkz.examples.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="egg_details")
public class EggDto {

	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_hotelName")
	private String hotelName;
	@Column(name="e_dishName")
	private String dishName;
	@Column(name="e_type")
	private String type;
	@Column(name="e_price")
	private Double price;
	@Column(name="e_quantity")
	private Integer quantity;
	@Column(name="e_takeAway")
	private Boolean takeAway;
	
	public EggDto() {
		System.out.println("runningg EggDto ");
	}

	public EggDto(String hotelName, String dishName, String type, Double price, Integer quantity, Boolean takeAway) {
		super();
		this.hotelName = hotelName;
		this.dishName = dishName;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.takeAway = takeAway;
	}

	@Override
	public String toString() {
		return "EggDto [hotelName=" + hotelName + ", dishName=" + dishName + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + ", takeAway=" + takeAway + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getDishName() {
		return dishName;
	}

	public String getType() {
		return type;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Boolean getTakeAway() {
		return takeAway;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setTakeAway(Boolean takeAway) {
		this.takeAway = takeAway;
	}
	
	
}
