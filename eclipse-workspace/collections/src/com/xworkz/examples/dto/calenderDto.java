package com.xworkz.examples.dto;

public class calenderDto {
	
	private int noOfHolidays;
	private String name;
	private int noOfMonths;
	
	
	public calenderDto() {
		super();
	}


	public calenderDto(int noOfHolidays, String name, int noOfMonths) {
		super();
		this.noOfHolidays = noOfHolidays;
		this.name = name;
		this.noOfMonths = noOfMonths;
	}

	
    public boolean equals(Object obj) {
		
		System.out.println("running equals from calender dto");
		if(obj!=null) {
			if(obj instanceof calenderDto) {
				calenderDto dto=(calenderDto)obj;
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
		return "calenderDto [noOfHolidays=" + noOfHolidays + ", name=" + name + ", noOfMonths=" + noOfMonths
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	public int getNoOfHolidays() {
		return noOfHolidays;
	}


	public void setNoOfHolidays(int noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfMonths() {
		return noOfMonths;
	}


	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	
	

}
