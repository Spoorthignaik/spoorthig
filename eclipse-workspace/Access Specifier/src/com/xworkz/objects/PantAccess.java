package com.xworkz.objects;

public class PantAccess {

	public Pant pant;

	public void pant1(Pant pant) {

		System.out.println(pant.getName());
		pant.setName("jeans");
		System.out.println("modified name" + pant.getName());

		System.out.println(pant.getBrand());
		pant.setBrand("levis");
		System.out.println("modified name" + pant.getBrand());

		System.out.println(pant.getPrice());
		pant.setPrice(1000);
		System.out.println("modified name"+pant.getPrice());
		
		System.out.println(pant.getColor());
		pant.setColor("blue");
		System.out.println("modified name"+pant.getColor());
		
		System.out.println(pant.getPatterns());
		pant.setPatterns("checks");
		System.out.println("modified name"+pant.getPatterns());
		
		System.out.println(pant.getType());
		pant.setType("ankelCut");
		System.out.println("modified name"+pant.getType());
		
		System.out.println(pant.isQuality());
		pant.setQuality(true);
		System.out.println("modified name"+pant.isQuality());
		
		System.out.println(pant.isOld());
		pant.setOld(true);
		System.out.println("modified name"+pant.isOld());
		
		System.out.println(pant.isPockets());
		pant.setPockets(false);
		System.out.println("modified name"+pant.isPockets());
		
		System.out.println(pant.isFit());
		pant.setFit(true);
		System.out.println("modified name"+pant.isFit());
		
		System.out.println(pant.isFashionable());
		pant.setFashionable(true);
		System.out.println("modified name"+pant.isFashionable());
		
	}

}
