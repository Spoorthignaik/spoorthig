package com.xworkz.objects;

public class BusAccess {
	
	public Bus bus;
	
	public void bus1(Bus bus) {
		
		System.out.println(bus.getName());
		bus.setName("SRE");
		System.out.println("modified name"+bus.getName());
		
		System.out.println(bus.getBrand());
		bus.setBrand("IC");
		System.out.println("modified name"+bus.getBrand());
		
		System.out.println(bus.getPrice());
		bus.setPrice(677849);
		System.out.println("modified name"+bus.getPrice());
		
		System.out.println(bus.getColor());
		bus.setColor("blue");
		System.out.println("modified name"+bus.getColor());
		
		System.out.println(bus.isNumberPlate());
		bus.setNumberPlate(true);
		System.out.println("modified name"+bus.isNumberPlate());
		
		System.out.println(bus.isFuelType());
		bus.setFuelType(true);
		System.out.println("modified name"+bus.isFuelType());
		
		System.out.println(bus.isWorking());
		bus.setWorking(true);
		System.out.println("modified name"+bus.isWorking());
		
		System.out.println(bus.getUsedFor());
		bus.setUsedFor("SRE");
		System.out.println("modified name"+bus.getUsedFor());
		
		System.out.println(bus.isTrending());
		bus.setTrending(false);
		System.out.println("modified name"+bus.isTrending());
		
		System.out.println(bus.isBest());
		bus.setBest(true);
		System.out.println("modified name"+bus.isBest());
		
	
		
	}
	
	

}
