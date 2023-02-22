package com.xworkz.examples.dto;

import com.xworkz.examples.constants.type;

public class DataBaseVendorDto {
	
	private String name;
	private String developedBy;
	private type type;
	private double size;
	private double licenseCost;
	
	public DataBaseVendorDto() {
		System.out.println("default constructor");
	}

	public DataBaseVendorDto(String name, String developedBy, com.xworkz.examples.constants.type type, double size,
			double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}
	
	@Override
	public int hashCode() {
		
		return 15;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDto) {
				DataBaseVendorDto data=(DataBaseVendorDto)obj;
				if(data.name.equals(this.name)) {
					System.out.println("name is matching"+data.name);
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDto [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public type getType() {
		return type;
	}

	public void setType(type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}
	
	
	

}
