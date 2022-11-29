package com.xworkz.examples;

public class Girls implements PayingGuest {

	@Override
	public int payRent() {
		System.out.println("running pay rent");
		return 0;
	}

	@Override
	public String frndsNotAllowed() {
		System.out.println("running  friends not allowed");
		return null;
	}

	@Override
	public boolean PhoneProhibited() {
		System.out.println("running phone prohibited");
		return false;
	}

	@Override
	public int closingTime() {
		System.out.println("running closing time");
		return 0;
	}

	@Override
	public boolean keepClean() {
		System.out.println("running keep clean");
		return false;
	}

}
