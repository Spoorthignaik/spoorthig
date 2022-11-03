package com.xworkz.objects;

public class TheaterAccess {

	public Theater theater;

	public void theater1(Theater theater) {

		System.out.println(theater.getName());
		theater.setName("HPC");
		System.out.println("modified name" + theater.getName());

		System.out.println(theater.isSeatAvailable());
		theater.setSeatAvailable(true);
		System.out.println("modified name"+theater.isSeatAvailable());
		
		System.out.println(theater.isAcAvailable());
		theater.setAcAvailable(true);
		System.out.println("modified name"+theater.isAcAvailable());
		
		System.out.println(theater.getShapeOfFlexi());
		theater.setShapeOfFlexi("square");
		System.out.println("modified name"+theater.getShapeOfFlexi());
		
		System.out.println(theater.getSize());
		theater.setSize("medium");
		System.out.println("modified name"+theater.getSize());
		
		System.out.println(theater.getLocation());
		theater.setLocation("shivamogga");
		System.out.println("modified name"+theater.getLocation());
		
		System.out.println(theater.getNoOfSeats());
		theater.setNoOfSeats(500);
		System.out.println("modified name" + theater.getNoOfSeats());

		System.out.println(theater.getPaymentMode());
		theater.setPaymentMode("upi");
		System.out.println("modified name" + theater.getPaymentMode());

		System.out.println(theater.isPopCorn());
		theater.setPopCorn(false);
		System.out.println("modified name" + theater.isPopCorn());

		System.out.println(theater.getPopCornPrice());
		theater.setPopCornPrice(300);
		System.out.println("modified name" + theater.getPopCornPrice());

		System.out.println(theater.isClean());
		theater.setClean(true);
		System.out.println("modified name" + theater.isClean());

	}

}
