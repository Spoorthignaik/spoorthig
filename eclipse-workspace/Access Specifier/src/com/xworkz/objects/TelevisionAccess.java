package com.xworkz.objects;

public class TelevisionAccess {

	public Television television;

	public void television1(Television television) {

		System.out.println(television.getName());
		television.setName("Smasung");
		System.out.println("modified name" + television.getName());

		System.out.println(television.getBrand());
		television.setBrand("samsungNew");
		System.out.println("modified name"+television.getBrand());
		
		System.out.println(television.getPrice());
		television.setPrice(60000);
		System.out.println("modified name"+television.getPrice());
		
		System.out.println(television.getColor());
		television.setColor("black");
		System.out.println("modified name"+television.getColor());
		
		System.out.println(television.isOld());
		television.setOld(true);
		System.out.println("modified name"+television.isOld());
		
		System.out.println(television.getType());
		television.setType("desktop");
		System.out.println("modified name"+television.getType());
		
		System.out.println(television.isWorking());
		television.setWorking(true);
		System.out.println("modified name"+television.isWorking());
		
		System.out.println(television.getUsedFor());
		television.setUsedFor("movies");
		System.out.println("modified name"+television.getUsedFor());
		
		System.out.println(television.isTrending());
		television.setTrending(false);
		System.out.println("modified name"+television.isTrending());
		
		System.out.println(television.isBest());
		television.setBest(true);
		System.out.println("modified name"+television.isBest());
		
		System.out.println(television.isElectric());
		television.setElectric(true);
		System.out.println("modified name"+television.isElectric());
		
	}
	
	
	
}
