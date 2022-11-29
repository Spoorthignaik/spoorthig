package com.xworkz.examples;

public class Patient implements Doctor {

	@Override
	public String Checking() {
		System.out.println("running check");
		return null;
	}

	@Override
	public String operation() {
		System.out.println("running operation");
		return null;
	}

	@Override
	public boolean admit() {
		System.out.println("running admit");
		return false;
	}

	@Override
	public boolean payBill() {
		System.out.println("running pay bill");
		return false;
	}

	@Override
	public boolean rest() {
		System.out.println("running to take rest");
		return false;
	}

}
