package com.xworkz.examples;

public class ScStStudents implements Scholarship{

	@Override
	public boolean applyApplication() {
		System.out.println("running apply application");
		return false;
	}

	@Override
	public boolean documentVeify() {
		System.out.println("running documen verify");
		return false;
	}

	@Override
	public boolean eligibility() {
		System.out.println("running eligibility");
		return false;
	}

	@Override
	public boolean submitApplication() {
		System.out.println("running sumit application");
		return false;
	}

	@Override
	public boolean verifyMarksCard() {
		System.out.println("running verify marks card");
		return false;
	}

}
