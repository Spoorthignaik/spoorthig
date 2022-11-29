package com.xworkz.examples;

public class PoliceWorkers implements Police{

	@Override
	public boolean arrest() {
		System.out.println("running arrest");
		return false;
	}

	@Override
	public boolean FIR() {
		System.out.println("running FIR");
		return false;
	}

	@Override
	public boolean uniform() {
		System.out.println("running uniform");
		return false;
	}

	@Override
	public boolean onDuty() {
		System.out.println("running on duty");
		return false;
	}

	@Override
	public boolean encounter() {
		System.out.println("running encounter");
		return false;
	}

}
