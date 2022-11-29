package com.xworkz.examples;

public class Humans implements Park {

	@Override
	public int entryTime() {
		System.out.println("running entry time");
		return 0;
	}

	@Override
	public int closingTime() {
		System.out.println("running closing time");
		return 0;
	}

	@Override
	public int payFees() {
		System.out.println("running pay fees");
		return 0;
	}

	@Override
	public boolean keepClean() {
		System.out.println("running keep clean");
		return false;
	}

	@Override
	public boolean planting() {
		System.out.println("running planting");
		return false;
	}
	
	

}
