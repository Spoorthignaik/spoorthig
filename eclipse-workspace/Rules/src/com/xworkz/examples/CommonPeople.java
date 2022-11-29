package com.xworkz.examples;

public class CommonPeople implements Government {

	@Override
	public boolean payGst() {
	  System.out.println("running pay gst");
		return false;
	}

	@Override
	public boolean followTraffiicRules() {
		 System.out.println("running follow traffic rules");
		return false;
	}

	@Override
	public boolean avoidPollution() {
		 System.out.println("running avoid pollution");
		return false;
	}

	@Override
	public boolean seniority() {
		 System.out.println("running seniority");
		return false;
	}

	@Override
	public boolean covid() {
		 System.out.println("running covid");
		return false;
	}

}
