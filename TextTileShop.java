<<<<<<< HEAD
package com.xworkz.programs;

public class TextTileShop {
	
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	public TextTileShop(){
		
		System.out.println("default value");
		
	}
	
	public TextTileShop(String ownerName)
	{
	this.ownerName=ownerName;
	System.out.println("created owner name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber)
	{
	this(ownerName);
	this.ownerDaughterNumber=ownerDaughterNumber;
	System.out.println("created owner name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName)
	{
	this(ownerName,ownerDaughterNumber);
	this.ownerWifeName=ownerWifeName;
	System.out.println("created owner wife name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName);
	this.ownerNoOfWifes=ownerNoOfWifes;
	System.out.println("created  number owner wife  of the textile shop");

	}

	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes,int shopNo)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName,ownerNoOfWifes);
	this.shopNo=shopNo;
	System.out.println("created shop number  of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes,int shopNo,long contactNo)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName,ownerNoOfWifes,shopNo);
	this.contactNo=contactNo;
	System.out.println("created contact number  of the textile shop");

	}
	
	
	
	
	
}
=======
package com.xworkz.programs;

public class TextTileShop {
	
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	public TextTileShop(){
		
		System.out.println("default value");
		
	}
	
	public TextTileShop(String ownerName)
	{
	this.ownerName=ownerName;
	System.out.println("created owner name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber)
	{
	this(ownerName);
	this.ownerDaughterNumber=ownerDaughterNumber;
	System.out.println("created owner name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName)
	{
	this(ownerName,ownerDaughterNumber);
	this.ownerWifeName=ownerWifeName;
	System.out.println("created owner wife name of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName);
	this.ownerNoOfWifes=ownerNoOfWifes;
	System.out.println("created  number owner wife  of the textile shop");

	}

	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes,int shopNo)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName,ownerNoOfWifes);
	this.shopNo=shopNo;
	System.out.println("created shop number  of the textile shop");

	}
	
	public TextTileShop(String ownerName,long ownerDaughterNumber,String ownerWifeName,int ownerNoOfWifes,int shopNo,long contactNo)
	{
	this(ownerName,ownerDaughterNumber,ownerWifeName,ownerNoOfWifes,shopNo);
	this.contactNo=contactNo;
	System.out.println("created contact number  of the textile shop");

	}
	
	
	
	
	
}
>>>>>>> c218642c8eaf22f2b8a3691d75d5d610db725fd0
