package com.xworkz.javaPrograms;

public class City {
	
	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	public City(Name name, boolean capital, double areaInSquareKilometers) {
		super();
		this.name = name;
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
	}
	
	public void show()
	{
	System.out.println(this.capital);	
	System.out.println(this.areaInSquareKilometers);	
	if(name!=null)
	{
		this.name.display();
		System.out.println(System.lineSeparator());
	}

	else {
		System.out.println("running");
	}

}

}
