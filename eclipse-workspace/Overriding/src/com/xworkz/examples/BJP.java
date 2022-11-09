package com.xworkz.examples;

public class BJP extends PoliticalParty {
	
	public int noOfMLA;

	public BJP(int noOfMp, boolean flag,int noOfMLA ) {
		super(noOfMp, flag);
		this.noOfMLA=noOfMLA;
		
	}
	
	public void display() {
		super.display();
		System.out.println(this.noOfMLA);
	}

}
