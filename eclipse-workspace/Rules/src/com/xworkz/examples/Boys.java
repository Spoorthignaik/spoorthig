package com.xworkz.examples;

public class Boys implements Hostel {

	@Override
	public boolean noSmoking() {
		System.out.println("running no smoking");
		return false;
	}

	@Override
	public boolean noUseOfAlcohol() {
		System.out.println("running no use of alcohol");
		return false;
	}

	@Override
	public String payRent() {
		System.out.println("running pay rent");
		return null;
	}

	@Override
	public boolean keepClean() {
		System.out.println("running keep clean");
		return false;
	}

	@Override
	public boolean outSideFoodAllowed() {
		System.out.println("running out side food allowed");
		return false;
	}

}
