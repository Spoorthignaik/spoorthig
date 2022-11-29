package com.xworkz.examples;

public class VehicleRiders implements TrafficRules {

	@Override
	public boolean wearHelmet() {
		System.out.println("running wear helet");
		return false;
	}

	@Override
	public boolean drinkAndDrive() {
		System.out.println("running drink and drive");
		return false;
	}

	@Override
	public String tripleRiding() {
		System.out.println("running ttriple riding");
		return null;
	}

	@Override
	public boolean driveSlowly() {
		System.out.println("running drive slowly");
		return false;
	}

	@Override
	public String followTrafficSignals() {
		System.out.println("running follow traffic signals");
		return null;
	}

}
