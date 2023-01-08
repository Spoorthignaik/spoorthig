package com.xworkz.examples.dto;

public class holidayDto {
	
	private int noOfHolidays;
	private String reasonsFor;
	private String day;
	
	
	public holidayDto() {
		super();
	}


	public holidayDto(int noOfHolidays, String reasonsFor, String day) {
		super();
		this.noOfHolidays = noOfHolidays;
		this.reasonsFor = reasonsFor;
		this.day = day;
	}
	
	@Override
    public boolean equals(Object obj) {
		
		System.out.println("running equals from holidays dto");
		if(obj!=null) {
			if(obj instanceof holidayDto) {
				holidayDto dto=(holidayDto)obj;
				if(dto.reasonsFor.equals(this.reasonsFor)) {
					System.out.println("reasons for is matching "+dto.reasonsFor);
					return true;
				}
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "holidayDto [noOfHolidays=" + noOfHolidays + ", reasonsFor=" + reasonsFor + ", day=" + day
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	public int getNoOfHolidays() {
		return noOfHolidays;
	}


	public void setNoOfHolidays(int noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}


	public String getReasonsFor() {
		return reasonsFor;
	}


	public void setReasonsFor(String reasonsFor) {
		this.reasonsFor = reasonsFor;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}
	
	
	
	
	
	
	
	

}
