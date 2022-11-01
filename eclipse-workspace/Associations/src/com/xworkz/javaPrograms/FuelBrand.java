package com.xworkz.javaPrograms;

public class FuelBrand {
	
	public String name;
	public long gstNo;
	public Location location=new Location();
	public int ratings;
	
	
	public FuelBrand(String name, long gstNo, int ratings) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.ratings = ratings;
	}
	
	public void source()
	{
		System.out.println("invoking source");
	}
	
	public void energy()
	{
		System.out.println("invoking energy");
	}

}
