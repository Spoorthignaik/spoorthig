package com.xworkz.examples;

public class Peoples implements Bank{

	@Override
	public boolean linkPanCard() {
		System.out.println("running link pan card");
		return false;
	}

	@Override
	public boolean linkPhoneNo() {
		System.out.println("running link phone no");
		return false;
	}

	@Override
	public boolean linkAdharCard() {
		System.out.println("running link adhar card");
		return false;
	}

	@Override
	public boolean updatePhoto() {
		System.out.println("running update photo");
		return false;
	}

	@Override
	public boolean address() {
		System.out.println("running address");
		return false;
	}

}
