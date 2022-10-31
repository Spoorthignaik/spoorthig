<<<<<<< HEAD
package com.xworkz.programs;

public class Chain {
	
	public String type;
	public int price;
	public double length;
	public String material;
	public double weight;
	public boolean stolen;
	public boolean fresh;
	public String usedFor;
	
	
	public Chain(){
		
		System.out.println("default value");
		
	}
	
	public Chain(String type)
	{
	this.type=type;
	System.out.println("created type of the chain");

	}
	
	public Chain(String type,int price)
	{
    this(type);
	this.price=price;
	System.out.println("created price of the chain");

	}
	
	public Chain(String type,int price, double length)
	{
    this(type,price);
	this.length=length;
	System.out.println("created length of the chain");

	}
	
	public Chain(String type,int price, double length,String material)
	{
    this(type,price,length);
	this.material=material;
	System.out.println("created length of the chain");

	}
	

	public Chain(String type,int price, double length,String material,double weight)
	{
    this(type,price,length,material);
	this.weight=weight;
	System.out.println("created weight of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen)
	{
    this(type,price,length,material,weight);
	this.stolen=stolen;
	System.out.println("created stolen of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen,boolean fresh)
	{
    this(type,price,length,material,weight,stolen);
	this.fresh=fresh;
	System.out.println("created fresh of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen,boolean fresh,String usedFor)
	{
    this(type,price,length,material,weight,stolen,fresh);
	this.usedFor=usedFor;
	System.out.println("created fresh of the chain");

	}
	
	
	

}
=======
package com.xworkz.programs;

public class Chain {
	
	public String type;
	public int price;
	public double length;
	public String material;
	public double weight;
	public boolean stolen;
	public boolean fresh;
	public String usedFor;
	
	
	public Chain(){
		
		System.out.println("default value");
		
	}
	
	public Chain(String type)
	{
	this.type=type;
	System.out.println("created type of the chain");

	}
	
	public Chain(String type,int price)
	{
    this(type);
	this.price=price;
	System.out.println("created price of the chain");

	}
	
	public Chain(String type,int price, double length)
	{
    this(type,price);
	this.length=length;
	System.out.println("created length of the chain");

	}
	
	public Chain(String type,int price, double length,String material)
	{
    this(type,price,length);
	this.material=material;
	System.out.println("created length of the chain");

	}
	

	public Chain(String type,int price, double length,String material,double weight)
	{
    this(type,price,length,material);
	this.weight=weight;
	System.out.println("created weight of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen)
	{
    this(type,price,length,material,weight);
	this.stolen=stolen;
	System.out.println("created stolen of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen,boolean fresh)
	{
    this(type,price,length,material,weight,stolen);
	this.fresh=fresh;
	System.out.println("created fresh of the chain");

	}
	
	public Chain(String type,int price, double length,String material,double weight,boolean stolen,boolean fresh,String usedFor)
	{
    this(type,price,length,material,weight,stolen,fresh);
	this.usedFor=usedFor;
	System.out.println("created fresh of the chain");

	}
	
	
	

}
>>>>>>> c218642c8eaf22f2b8a3691d75d5d610db725fd0
