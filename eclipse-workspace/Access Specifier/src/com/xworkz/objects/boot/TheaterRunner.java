package com.xworkz.objects.boot;

import com.xworkz.objects.Theater;
import com.xworkz.objects.TheaterAccess;

public class TheaterRunner {

	public static void main(String[] args) {

		TheaterAccess theaterAccess = new TheaterAccess();
		Theater theater = new Theater();

		System.out.println(theater.getName());
		System.out.println(theater.isSeatAvailable());
		System.out.println(theater.isAcAvailable());
		System.out.println(theater.getShapeOfFlexi());
		System.out.println(theater.getSize());
		System.out.println(theater.getLocation());
		System.out.println(theater.getNoOfSeats());
		System.out.println(theater.getPaymentMode());
		System.out.println(theater.isPopCorn());
		System.out.println(theater.getPopCornPrice());
		System.out.println(theater.isClean());

		System.out.println(System.lineSeparator());
		theaterAccess.theater1(theater);		
		
		}
		
		
	
	
	
	

}
