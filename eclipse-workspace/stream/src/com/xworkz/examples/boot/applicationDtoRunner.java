package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.dto.applicationDto;

public class applicationDtoRunner {

	public static void main(String[] args) {
		
		
		Collection<applicationDto>application=new ArrayList<applicationDto>();
		application.add(new applicationDto("MS office", 2007, true, "Microsoft", 10000));
		application.add(new applicationDto("Autocad", 2010, true, "AutoDesk", 1500));
		application.add(new applicationDto("StaadPro", 4, false, "REI", 2000));
		application.add(new applicationDto("google", 2000, true, "google", 3000));
		
		application.stream()
		.filter(dto -> dto.isFree() && dto.getDevelopedBy()=="google")
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));
		
		application.stream()
		.filter(dto ->dto.getVersion()>5)
		.map(dto -> dto.getName())
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));
		
		
		
		
	}
	
	

}
