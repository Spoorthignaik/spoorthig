<<<<<<< HEAD
package com.xworkz.programs;

public class PassPort {
	
	
	public int no;
	public String name;
	public double expiryDate;
	public String country;
	public double issuedDate;
	public int noOfLeafes;
	
	public PassPort(int no)
	{
		this.no=no;
		System.out.println("created number of the passport");
	}
	
	public PassPort(String name)
	{
		this.name=name;
		System.out.println("created name of the passport");
	}
	
	public PassPort(double expiryDate)
	{
		this.expiryDate=expiryDate;
		System.out.println("created expirydate of the passport");
	}
	
	public PassPort(String country,int no)
	{
		this.country=country;
		System.out.println("created country of the passport");
		
		this.no=no;
		System.out.println("created number of the passport");

	}

	public PassPort(String country, double expiryDate) {
		this.country =country;
		System.out.println("created number of the passport");

		this.expiryDate = expiryDate;
		System.out.println("created expiry date of the passport");
	}

	public PassPort(int no, double expiryDate) {
		this.no = no;
		System.out.println("created number of the passport");

		this.expiryDate = expiryDate;
		System.out.println("created expiry date of the passport");

	}

	public PassPort(int no, String name) {
		this.no = no;
		System.out.println("created number of the passport");

		this.name = name;
		System.out.println("created name of the passport");

	}

}
=======
package com.xworkz.programs;

public class PassPort {
	
	
	public int no;
	public String name;
	public double expiryDate;
	public String country;
	public double issuedDate;
	public int noOfLeafes;
	
	public PassPort(int no)
	{
		this.no=no;
		System.out.println("created number of the passport");
	}
	
	public PassPort(String name)
	{
		this.name=name;
		System.out.println("created name of the passport");
	}
	
	public PassPort(double expiryDate)
	{
		this.expiryDate=expiryDate;
		System.out.println("created expirydate of the passport");
	}
	
	public PassPort(String country,int no)
	{
		this.country=country;
		System.out.println("created country of the passport");
		
		this.no=no;
		System.out.println("created number of the passport");
		
		
	}
	
	
	public PassPort(String country,double expiryDate)
	{
		this.no=no;
		System.out.println("created number of the passport");
		
		this.expiryDate=expiryDate;
		System.out.println("created expiry date of the passport");
		
	}
	
	
	public PassPort(int no,double expiryDate)
	{
		this.no=no;
		System.out.println("created number of the passport");
		
		this.expiryDate=expiryDate;
		System.out.println("created expiry date of the passport");
		
		
	}
	
	
	public PassPort(int no,String name)
	{
		this.no=no;
		System.out.println("created number of the passport");
		
		this.name=name;
		System.out.println("created name of the passport");
		
		
	}

}
>>>>>>> c218642c8eaf22f2b8a3691d75d5d610db725fd0
