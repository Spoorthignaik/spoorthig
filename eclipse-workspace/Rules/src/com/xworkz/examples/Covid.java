package com.xworkz.examples;

public class Covid implements Citizen {

	@Override
	public boolean wearMask() {
		System.out.println("running wear mask");
		return true;
	}

	@Override
	public boolean stayHome() {
		System.out.println("running stay home");
		return false;
	}

	@Override
	public boolean sanitize() {
		System.out.println("running sanitize");
		return true;
	}

	@Override
	public boolean quarantine() {
		System.out.println("running quarantine");
		return false;
	}

	@Override
	public boolean staySafe() {
		System.out.println("running stay safe");
		return false;
	}

	

	
	
		
	
}
