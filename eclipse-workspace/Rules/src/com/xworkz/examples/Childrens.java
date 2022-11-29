package com.xworkz.examples;

public class Childrens implements School{

	@Override
	public boolean uniform() {
		System.out.println(" running uniform");
		return false;
	}

	@Override
	public String idCard() {
		System.out.println(" running id card");
		return null;
	}

	@Override
	public boolean attedance() {
		System.out.println(" running attendance");
		return false;
	}

	@Override
	public boolean assesments() {
		System.out.println(" running assesments");
		return false;
	}

	@Override
	public int timings() {
		System.out.println(" running timimgs");
		return 0;
	}
	
	

}
