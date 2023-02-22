package com.xworkz.examples.dto;

public class applicationDto {
	
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;
	
	public applicationDto() {
		System.out.println("default constructor");
	}

	public applicationDto(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		
		return 20;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof applicationDto) {
				applicationDto dto=(applicationDto)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching="+dto.name);
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "applicationDto [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
