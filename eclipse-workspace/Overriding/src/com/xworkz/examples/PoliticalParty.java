package com.xworkz.examples;

public class PoliticalParty {
	
	public  int noOfMp;
	public boolean flag;
	
	public PoliticalParty(int noOfMp, boolean flag) {
		super();
		this.noOfMp = noOfMp;
		this.flag = flag;
	}

	public void display() {
		System.out.println(this.noOfMp);
		System.out.println(this.flag);
		
	}
}
