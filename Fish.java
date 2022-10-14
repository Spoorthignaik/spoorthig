package com.xworkz.programs;

public class Fish {

	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;
	
	public Fish(String name)	
	{
		this.name=name;
		System.out.println("created name of the fish");
		
	}
	
	public Fish(int price,String type )
	{
	  
		this.price=price;
		System.out.println("created price of the fish");
		this.type=type;
		System.out.println("created type of the fish");	
	}
		
	public Fish(double weight,int price)
	{
		this.weight=weight;
		System.out.println("created weight of the fish");
		this.price=price;
		System.out.println("created price of the fish");	
	}

	public Fish(double length,String name)
	{
		this.length=length;
		System.out.println("created length of the fish");
		this.name=name;
		System.out.println("created price of the fish");	
	}
	
	public Fish(String type, int price)
	{
		this.type=type;
		System.out.println("created type of the fish");
		this.price=price;
		System.out.println("created price of the fish");	
	}
	
	public Fish(int price,double length)
	{
		this.price=price;
		System.out.println("created price of the fish");
		this.length=length;
		System.out.println("created length of the fish");	
	}
	
	public Fish(int price)
	{
		this.price=price;
		System.out.println("created price of the fish");	
	}
	
	
	
	
}
