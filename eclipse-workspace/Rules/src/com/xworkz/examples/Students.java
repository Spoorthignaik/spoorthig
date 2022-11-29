package com.xworkz.examples;

public class Students implements CollegeRules {

	@Override
	public boolean attendClass() {
		System.out.println("running attendance");
		return false;
	}

	@Override
	public boolean attendance() {
		System.out.println("running attendance");
		return false;
	}

	@Override
	public String internals() {
		System.out.println("running internals");
		return null;
	}

	@Override
	public boolean exams() {
		System.out.println("running exams");
		return false;
	}

	@Override
	public boolean discipline() {
		System.out.println("running discipline");
		return false;
	}

	
}
