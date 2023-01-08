package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.holidayDto;
import com.xworkz.examples.dto.place;

public class placeRunner {

	public static void main(String[] args) {
		
		
		place place1=new place("shivamogga", "jogFalls", 7);
		place place2=new place("bangalore", "sowtCompany", 5);
		place place3=new place("coorg", "coffeEstate", 8);
		place place4=new place("davangere", "beeneDose", 6);
		place place5=new place("mysur", "palace", 9);
		
		

		boolean equals=place1.equals(place4);
		System.out.println(equals);
		
		Collection<place>places=new ArrayList<place>();
		places.add(place1);
		places.add(place5);
		

		boolean contains=places.contains(place5);
		System.out.println("contains="+contains);
		

	}

}
