package com.xworkz.objects.boot;

import com.xworkz.objects.Bus;
import com.xworkz.objects.BusAccess;

public class BusRunner {

	public static void main(String[] args) {

		BusAccess busAccess = new BusAccess();
		Bus bus = new Bus();

		System.out.println(bus.getName());
		System.out.println(bus.getBrand());

		System.out.println(bus.getPrice());
		System.out.println(bus.getColor());
		System.out.println(bus.isNumberPlate());
		System.out.println(bus.isFuelType());
		System.out.println(bus.isWorking());
		System.out.println(bus.getUsedFor());
		System.out.println(bus.isTrending());
		System.out.println(bus.isBest());
		System.out.println(bus.isElectric());

		System.out.println(System.lineSeparator());
		busAccess.bus1(bus);

	}

}
