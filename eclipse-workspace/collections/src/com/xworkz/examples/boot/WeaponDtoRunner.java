package com.xworkz.examples.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.examples.constants.Type;
import com.xworkz.examples.dto.WeaponDto;

public class WeaponDtoRunner {

	public static void main(String[] args) {
		
		
		WeaponDto dto=new WeaponDto("Trishool", "stainlessSteel", " lord shiva", 40000, Type.M416);
		WeaponDto dto1=new WeaponDto("knief", "stainlessSteel", "world war", 56675, Type.MA47);
		WeaponDto dto2=new WeaponDto("gun", "alluminium", " war ", 70000, Type.AK47);
		WeaponDto dto3=new WeaponDto("Panzer", "alluminium", "netflix", 76766, Type.M416);
		
	
		
		
		
		
		
		Collection<WeaponDto> dtos = Stream.of(dto,dto1,dto2,dto3).collect(Collectors.toSet());
		
		System.out.println("Checking the Ascending order");
		
		dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e));
		 System.out.println(System.lineSeparator());
	    dtos.stream().forEach(e->System.out.println("Made By"+e.getMadeBy()+" "+"Made on"+e.getMadeOn()));
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(e->System.out.println(e.getName()));
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
		
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		

	    System.out.println(System.lineSeparator());
	    dtos.stream().sorted((a1,a2)->Double.compare(a1.getPrice(),a2.getPrice())).forEach(e->System.out.println(e.getPrice()));
	    
	    System.out.println(System.lineSeparator());
	    dtos.stream().sorted((a1,a2)->Double.compare(a2.getPrice(),a1.getPrice())).forEach(e->System.out.println(e.getPrice()));
	   
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e.getName()));
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a2.getType().compareTo(a1.getType())).forEach(e->System.out.println(e.getType()));
		dtos.stream().sorted((a1,a2)->a2.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
			

}
	

			
		
		
		
		
		
	}


