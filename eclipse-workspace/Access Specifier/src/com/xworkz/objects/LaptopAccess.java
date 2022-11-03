package com.xworkz.objects;

public class LaptopAccess {

	public Laptop laptop;

	public void laptop1(Laptop laptop) {

		System.out.println(laptop.getName());
		laptop.setName("hp");
		System.out.println("modified name" + laptop.getName());

		System.out.println(laptop.getBrand());
		laptop.setBrand("hpNew");
		System.out.println("modified name" + laptop.getBrand());

		System.out.println(laptop.getPrice());
		laptop.setPrice(687849);
		System.out.println("modified name" + laptop.getPrice());

		System.out.println(laptop.getColor());
		laptop.setColor("grey");
		System.out.println("modified name" + laptop.getColor());

		System.out.println(laptop.isOld());
		laptop.setOld(true);
		System.out.println("modified name" + laptop.isOld());

		System.out.println(laptop.getType());
		laptop.setType("desktop");
		System.out.println("modified name" + laptop.getType());

		System.out.println(laptop.isWorking());
		laptop.setWorking(true);
		System.out.println("modified name" + laptop.isWorking());

		System.out.println(laptop.getUsedFor());
		laptop.setUsedFor("work");
		System.out.println("modified name" + laptop.getUsedFor());

		System.out.println(laptop.isTrending());
		laptop.setTrending(false);
		System.out.println("modified name" + laptop.isTrending());

		System.out.println(laptop.isBest());
		laptop.setBest(true);
		System.out.println("modified name" + laptop.isBest());

		System.out.println(laptop.isElectric());
		laptop.setElectric(true);
		System.out.println("modified name" + laptop.isElectric());

	}

}
