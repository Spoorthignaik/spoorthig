package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.AirportDto;
import com.xworkz.examples.dto.calenderDto;

public class AirportDtoRunner {

	public static void main(String[] args) {
		
		
		AirportDto dto1=new AirportDto("kempegowda","bangalore", "international");
		AirportDto dto2=new AirportDto("hubballiAirport","hubballi", "domestic");
		AirportDto dto3=new AirportDto("Bajpe","mangaluru", "international");
		AirportDto dto4=new AirportDto("vijayanagara","ballary", "domestic");
		AirportDto dto5=new AirportDto("kempegowda","bangalore", "militaryAirBase");
		
		
		boolean equals=dto1.equals(dto5);
		System.out.println(equals);
		
		
		Collection<AirportDto>airports=new ArrayList<AirportDto>();
		airports.add(dto1);
		airports.add(dto5);
		
		boolean contains=airports.contains(dto4);
		System.out.println(contains);
        
	}

}
