package com.xworkz.examples;

public class Employee implements Company {

	@Override
	public int loginTime() {
		System.out.println("running login time");
		return 0;
	}

	@Override
	public int logOutTime() {
		System.out.println("running logout time");
		return 0;
	}

	@Override
	public String dressCode() {
		System.out.println("running dress code");
		return null;
	}

	@Override
	public boolean idCard() {
		System.out.println("running id card");
		return false;
	}

	@Override
	public boolean lunchBreakTime() {
		System.out.println("running lunch break time");
		return false;
	}
	
	

}
