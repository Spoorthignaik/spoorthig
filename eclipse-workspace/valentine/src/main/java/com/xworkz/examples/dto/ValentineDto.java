package com.xworkz.examples.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ValentineDto {

	
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String name;
	@NotBlank(message = "place should be selected")
	private String place;
	@NotBlank(message = "Gift should be selected")
	private String gift;
	@Size(min = 3, max = 20, message = "ValentineName cannot be less than 3 or greater than 20")
	private String valentineName;

	public ValentineDto() {
		System.out.println("created ValentineDto");
	}

	public ValentineDto(String name, String place, String gift, String valentineName) {
		super();
		this.name = name;
		this.place = place;
		this.gift = gift;
		this.valentineName = valentineName;
	}

	@Override
	public String toString() {
		return "ValentineDto [name=" + name + ", place=" + place + ", gift=" + gift + ", valentineName=" + valentineName
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public String getGift() {
		return gift;
	}

	public String getValentineName() {
		return valentineName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	public void setValentineName(String valentineName) {
		this.valentineName = valentineName;
	}

}
