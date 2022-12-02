package com.xworkz.examples;

public class XworkzRajajiNagar implements Xworkz,TrafficRule {

	@Override
	public boolean interview() {
		System.out.println("running interrview");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("running placement");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("running training");
		return false;
	}

	@Override
	public boolean wearHelmet() {
		System.out.println("running wear helmet");
		return false;
	}

	@Override
	public boolean tripleRide() {
		System.out.println("running triple ride");
		return false;
	}

}
