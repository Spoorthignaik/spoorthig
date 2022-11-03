package com.xworkz.objects;

public class ShirtAccess {
	

	public Shirt shirt;
	
	public void shirt1(Shirt shirt) {
		
		System.out.println(shirt.getName());
		shirt.setName("hoodie");
		System.out.println("modified name"+shirt.getName());
		
		System.out.println(shirt.getBrand());
		shirt.setBrand("denim");
		System.out.println("modified name"+shirt.getBrand());
		
		System.out.println(shirt.getPrice());
		shirt.setPrice(1000);
		System.out.println("modified name"+shirt.getPrice());
		
		System.out.println(shirt.getColor());
		shirt.setColor("blue");
		System.out.println("modified name"+shirt.getColor());
		
		System.out.println(shirt.getPatterns());
		shirt.setPatterns("plain");
		System.out.println("modified name"+shirt.getPatterns());
		
		System.out.println(shirt.getType());
		shirt.setType("pocket type");
		System.out.println("modified name"+shirt.getType());
		
		System.out.println(shirt.isQuality());
		shirt.setQuality(true);
		System.out.println("modified name"+shirt.isQuality());
		
		System.out.println(shirt.isOld());
		shirt.setOld(true);
		System.out.println("modified name"+shirt.isOld());
		
		System.out.println(shirt.isPockets());
		shirt.setPockets(false);
		System.out.println("modified name"+shirt.isPockets());
		
		System.out.println(shirt.isFit());
		shirt.setFit(true);
		System.out.println("modified name"+shirt.isFit());
		
		System.out.println(shirt.isFashionable());
		shirt.setFashionable(true);
		System.out.println("modified name"+shirt.isFashionable());
		
	}
	
	


}
