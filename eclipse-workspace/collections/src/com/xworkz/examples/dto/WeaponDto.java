package com.xworkz.examples.dto;

import java.io.Serializable;

import com.xworkz.examples.constants.Type;

public class WeaponDto implements Serializable ,Comparable {
	
	
	private String name;
	private String madeBy;
	private String madeOn;
	private double price;
	private Type type;
	
	public WeaponDto() {
		System.out.println("default constructor");
	}

	public WeaponDto(String name, String madeBy, String madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDto) {
				WeaponDto dto=new WeaponDto();
				if(this.name.equals(this.name)) {
					System.out.println("same name="+dto.name);
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		this.name.compareTo(getName());
		return 0;
	}
	
	

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	
	

}
