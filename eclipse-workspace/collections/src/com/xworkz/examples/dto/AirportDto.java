package com.xworkz.examples.dto;

public class AirportDto {
	
	private String name;
	private String location;
	private String type;
	
	
	public AirportDto() {
		super();
	}


	public AirportDto(String name, String location, String type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	
   public boolean equals(Object obj) {
		
		System.out.println("running equals from airport dto");
		if(obj!=null) {
			if(obj instanceof AirportDto) {
				AirportDto dto=(AirportDto)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", location=" + location + ", type=" + type + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
