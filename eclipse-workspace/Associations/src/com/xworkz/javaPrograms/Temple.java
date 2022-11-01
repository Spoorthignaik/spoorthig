package com.xworkz.javaPrograms;

public class Temple {

	public String name;
	public String mainPriest;
	public int noOfVisitors;
	public long collectionPerDay;

	public God god=new God ("parvathi","female","ashtavatara")

	public Temple(
	String name1, String mainPriest,
	int noOfVisitors1,
	long collectionPerDay1)
	{
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;

	}

	public Temple(java.lang.String string2, java.lang.String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		System.out.println(this.collectionPerDay);
		god.display2();
	}
}