package com.xworkz.objects.boot;

import com.xworkz.objects.Laptop;
import com.xworkz.objects.LaptopAccess;

public class LaptopRunner {

	public static void main(String[] args) {

	LaptopAccess laptopAccess = new LaptopAccess();
	Laptop laptop = new Laptop();

	System.out.println(laptop.getName());
	System.out.println(laptop.getBrand());
	System.out.println(laptop.getPrice());
	System.out.println(laptop.getColor());
	System.out.println(laptop.isOld());
	System.out.println(laptop.getType());
	System.out.println(laptop.isWorking());
	System.out.println(laptop.getUsedFor());
	System.out.println(laptop.isTrending());
	System.out.println(laptop.isBest());
	System.out.println(laptop.isElectric());

	System.out.println(System.lineSeparator());
	laptopAccess.laptop1(laptop);
	
	}	
}
