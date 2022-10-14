package com.xworkz.programs;

public class Boat {
	
	public String name;
	public boolean color;
	public char companyName;
	public String type;
	public String owner;
	
	public Boat(String name)	
	{
		this.name=name;
		System.out.println("created name of the boat");
		
	}
	
	public Boat(boolean color)
	{
	  
		this.color=color;
		System.out.println("created color of the boat");
	}
		
	public Boat(char companyName)
	{
		this.companyName=companyName;
		System.out.println("created company name of the boat");
	}

	public Boat(boolean color,char companyName)
	{
		this.color=color;
		System.out.println("created color of the boat");
		this.companyName=companyName;
		System.out.println("created company name of the boat");	
	}
	
	public Boat(char companyName, boolean color)
	{
		this.companyName=companyName;
		System.out.println("created company name of the boat");
		this.color=color;
		System.out.println("created color of the boat");	
	}
	
	public Boat(String type,boolean color)
	{
		this.type=type;
		System.out.println("created type of the boat");
		this.color=color;
		System.out.println("created color of the boat");	
	}
	
	public Boat(char companyName,String owner)
	{
		this.companyName=companyName;
		System.out.println("created company name of the boat");	
		
		this.owner=owner;
		System.out.println("created owner of the boat");
		
		
		
	}
	
	
	
}


