package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.holidayDto;

public class holidayDtoRunner {

	public static void main(String[] args) {
		
		
		holidayDto dto1=new holidayDto(5, "dasara", "friday");
		holidayDto dto2=new holidayDto(2, "deepavali", "tuesday");
		holidayDto dto3=new holidayDto(1, "christmas", "sunday");
		holidayDto dto4=new holidayDto(3, "ugadi", "wednesday");
		holidayDto dto5=new holidayDto(4, "dasara", "thursday");
		
		boolean equals=dto1.equals(dto5);
		System.out.println(equals);
		
		
		Collection<holidayDto>holidays=new ArrayList<holidayDto>();
		holidays.add(dto1);
		holidays.add(dto5);
		

		boolean contains=holidays.contains(dto5);
		System.out.println("contains"+contains);
		
		
	}

}
