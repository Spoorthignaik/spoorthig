package com.xworkz.javaPrograms.boot;

import com.xworkz.javaPrograms.Fuel;

public class FuelRunner {

	public static void main(String[] args) {

		Fuel fuel = new Fuel(true, "power", 150, 55.8);
		fuel.display();

	}

}
