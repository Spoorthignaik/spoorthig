package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.calenderDto;

public class calenderDtoRunner {

	public static void main(String[] args) {
		
		calenderDto dto1=new calenderDto(20, "kalaNirnaya", 12);
		calenderDto dto2=new calenderDto(15, "mahalakshmi", 12);
		calenderDto dto3=new calenderDto(23, "kalaNirnaya", 12);
		calenderDto dto4=new calenderDto(12, "mangalurSamachar", 12);
		calenderDto dto5=new calenderDto(21, "vaishakha", 12);
		
		boolean equals=dto1.equals(dto3);
		System.out.println(equals);
		
		Collection<calenderDto>calenders=new ArrayList<calenderDto>();
		calenders.add(dto1);
		calenders.add(dto3);
		
		boolean contains=calenders.contains(dto4);
		System.out.println(contains);
		
	}

}
