package com.xworkz.objects;

public class CarAccess {
	
	

	public Car car;
	
	public void car1(Car car) {
		
		System.out.println(car.getName());
		car.setName("sonet");
		System.out.println("modified name"+car.getName());
		
		System.out.println(car.getBrand());
	    car.setBrand("kia");
		System.out.println("modified name"+car.getBrand());
		
		System.out.println(car.getPrice());
		car.setPrice(687849);
		System.out.println("modified name"+car.getPrice());
		
		System.out.println(car.getColor());
		car.setColor("blue");
		System.out.println("modified name"+car.getColor());
		
		System.out.println(car.isNumberPlate());
		car.setNumberPlate(true);
		System.out.println("modified name"+car.isNumberPlate());
		
		System.out.println(car.getFuelType());
		car.setFuelType("petrol");
		System.out.println("modified name"+car.getFuelType());
		
		System.out.println(car.isWorking());
		car.setWorking(true);
		System.out.println("modified name"+car.isWorking());
		
		System.out.println(car.getUsedFor());
		car.setUsedFor("trip");
		System.out.println("modified name"+car.getUsedFor());
		
		System.out.println(car.isTrending());
		car.setTrending(false);
		System.out.println("modified name"+car.isTrending());
		
		System.out.println(car.isBest());
		car.setBest(true);
		System.out.println("modified name"+car.isBest());
		
		System.out.println(car.isElectric());
		car.setElectric(true);
		System.out.println("modified name"+car.isElectric());
		
	}
	
	

}
