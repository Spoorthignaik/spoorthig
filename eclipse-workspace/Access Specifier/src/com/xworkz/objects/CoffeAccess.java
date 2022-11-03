package com.xworkz.objects;

public class CoffeAccess {
	

	public Coffe coffe;
	
	public void coffe1(Coffe coffe) {
		
		System.out.println(coffe.getName());
		coffe.setName("cold coffe");
		System.out.println("modified name"+coffe.getName());
		
		System.out.println(coffe.getType());
		coffe.setType("ameicano");
		System.out.println("modified name"+coffe.getType());
		
		System.out.println(coffe.isGood());
		coffe.setGood(true);
		System.out.println("modified name"+coffe.isGood());
		
		System.out.println(coffe.getColor());
		coffe.setColor("brown");
		System.out.println("modified name"+coffe.getColor());
		
		System.out.println(coffe.isSweet());
		coffe.setSweet(true);
		System.out.println("modified name"+coffe.isSweet());
		
		System.out.println(coffe.getPrice());
		coffe.setPrice(150);
		System.out.println("modified name"+coffe.getPrice());
		
		System.out.println(coffe.getBarCode());
		coffe.setBarCode(123456);
		System.out.println("modified name"+coffe.getBarCode());
		
		System.out.println(coffe.getBrand());
		coffe.setBrand("levista");
		System.out.println("modified name"+coffe.getBrand());
		
		System.out.println(coffe.getIngredient());
		coffe.setIngredient("coffe powder");
		System.out.println("modified name"+coffe.getIngredient());
		
		System.out.println(coffe.getCalories());
		coffe.setCalories("small");
		System.out.println("modified name"+coffe.getCalories());
		
		
		
	}
	
	

}
