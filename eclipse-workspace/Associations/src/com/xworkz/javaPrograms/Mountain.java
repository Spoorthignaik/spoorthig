package com.xworkz.javaPrograms;

public class Mountain {
	
	
	public String name;
	public double height;
	
	//public Location location=new Location("netheavathi","kuduremukh",25689,"india");
	public Temple temple=new Temple("shivagange","tumkur",479887,75488);
	
	
	public Mountain() {
		
	}
	
	public Mountain(String name,double height) {
		
	}
	
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.height);
		location.showOff();
		temple.display();
		
	}
	
	

}
