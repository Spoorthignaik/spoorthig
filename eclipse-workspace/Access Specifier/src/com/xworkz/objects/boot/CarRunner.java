package com.xworkz.objects.boot;

import com.xworkz.objects.Car;
import com.xworkz.objects.CarAccess;

public class CarRunner {
	
	public static void main(String[] args) {
	
	CarAccess carAccess = new CarAccess();
	Car car = new Car();

	System.out.println(car.getName());
	System.out.println(car.getBrand());
	System.out.println(car.getPrice());
	System.out.println(car.getColor());
	System.out.println(car.isNumberPlate());
	System.out.println(car.getFuelType());
	System.out.println(car.isWorking());
	System.out.println(car.getUsedFor());
	System.out.println(car.isTrending());
	System.out.println(car.isBest());
	System.out.println(car.isElectric());

	System.out.println(System.lineSeparator());
	carAccess.car1(car);
	
	
	}
	
	
}
