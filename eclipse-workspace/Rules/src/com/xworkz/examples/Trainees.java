package com.xworkz.examples;

public class Trainees implements Institutions {

	@Override
	public boolean trainingTime() {
		System.out.println("running training time");
		return false;
	}

	@Override
	public boolean presentation() {
		System.out.println("running presentations");
		return false;
	}

	@Override
	public boolean CloseTime() {
		System.out.println("running close time");
		return false;
	}

	@Override
	public boolean payFees() {
		System.out.println("running pay fees");
		return false;
	}

	@Override
	public boolean attendPlacements() {
		System.out.println("running attend placements");
		return false;
	}

}
