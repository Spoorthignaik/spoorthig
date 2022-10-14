package com.xworkz.programs;

public class Bread {
	
	public String type;
	public char shape;
	public int price;
	public double quantity;
	public String companyName;
	
	public Bread(String type)
	{
		this.type=type;
		System.out.println("created type of the bread");
	}
	
	public Bread(char shape)
	{
		this.shape=shape;
		System.out.println("created shape of the bread");
	}
	
	public Bread(int price)
	{
		this.price=price;
		System.out.println("created price of the bread");
	}
	
	public Bread(double quantity)
	{
		this.quantity=quantity;
		System.out.println("created quantity of the bread");
	}
	
	public Bread(String companyName,int price)
	{
		this.companyName=companyName; 
		System.out.println("created company name of the bread");
		
		this.price=price; 
		System.out.println("created price  of the bread");
	}
	
	public Bread(int price,char shape)
	{
		
		this.price=price; 
		System.out.println("created price  of the bread");
		
		this.shape=shape; 
		System.out.println("created shape of the bread");
	}
	
	public Bread(String companyName,double quantity)
	{
		
		this.companyName=companyName; 
		System.out.println("created company  of the bread");
		
		this.quantity=quantity; 
		System.out.println("created quantity of the bread");
	}
	
	
	
	
	
}
