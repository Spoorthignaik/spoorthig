package com.xworkz.examples.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AeroplaneDto {
	
	@Size(min = 3,max = 20,message = "company should me more tham 3 and less than 20 chars ")
	private String company;
	@NotBlank
	private String name;
	@NotNull
	private Long cost;
	@NotBlank
	private String type;
	@NotBlank
	private String country;
	
	public AeroplaneDto() {
		System.out.println("created AeroplaneDto");
	}
	
	
	public AeroplaneDto(String company, String name, Long cost, String type, String country) {
		super();
		this.company = company;
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "AeroplaneDto [company=" + company + ", name=" + name + ", cost=" + cost + ", type=" + type
				+ ", country=" + country + "]";
	}
	
	
	public String getCompany() {
		return company;
	}
	public String getName() {
		return name;
	}
	public Long getCost() {
		return cost;
	}
	public String getType() {
		return type;
	}
	public String getCountry() {
		return country;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
