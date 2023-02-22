package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.dto.palaceDto;

public class palaceDtoRunner {

	public static void main(String[] args) {
		
		
		Collection<palaceDto>palace=new ArrayList<palaceDto>();
		palace.add(new palaceDto("shivappaNayaka", "shivamogga", "shivappaNayaka", false, 10));
		palace.add(new palaceDto("lalith mahal", "mysore", "vijaya nanda", false, 100));
		palace.add(new palaceDto("mysore palace", "mysore", "krishna raja wadeyar", true, 150));
		palace.add(new palaceDto("bengaluru", "bengaluru", "vijay", true, 200));
		
		
		palace.stream()
		.filter(dto ->!dto.isDestroyed())
		.collect(Collectors.toSet())
		.forEach(dto ->System.out.println(dto));


	}

}
