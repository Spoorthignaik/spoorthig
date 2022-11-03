package com.xworkz.objects;

public class TractorAccess {

	
public Tractor tractor;
	
	public void tractor1(Tractor tractor) {
		
		System.out.println(tractor.getName());
		tractor.setName("mahindra");
		System.out.println("modified name"+tractor.getName());
		
		System.out.println(tractor.getBrand());
		tractor.setBrand("mahindra xy");
		System.out.println("modified name"+tractor.getBrand());
		
		System.out.println(tractor.getPrice());
		tractor.setPrice(6878490);
		System.out.println("modified name"+tractor.getPrice());
		
		System.out.println(tractor.getColor());
		tractor.setColor("Red");
		System.out.println("modified name"+tractor.getColor());
		
		System.out.println(tractor.getModel());
		tractor.setModel(2007);
		System.out.println("modified name"+tractor.getModel());

	
		System.out.println(tractor.isWorking());
		tractor.setWorking(true);
		System.out.println("modified name"+tractor.isWorking());
		
		System.out.println(tractor.getUsedFor());
		tractor.setUsedFor("agriculture");
		System.out.println("modified name"+tractor.getUsedFor());
		
		System.out.println(tractor.isTrending());
		tractor.setTrending(false);
		System.out.println("modified name"+tractor.isTrending());
		
		System.out.println(tractor.isBest());
		tractor.setBest(true);
		System.out.println("modified name"+tractor.isBest());
		
		System.out.println(tractor.getType());
		tractor.setType("mini");
		System.out.println("modified name"+tractor.getType());

	}

}
