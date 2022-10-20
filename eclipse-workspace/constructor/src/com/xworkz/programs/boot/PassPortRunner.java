package com.xworkz.programs.boot;

import com.xworkz.programs.PassPort;

public class PassPortRunner {

	public static void main(String[] args)
	{
	
		PassPort passport=new PassPort(12);
		System.out.println(passport.no);	
		System.out.println(passport.name);	
		System.out.println(passport.expiryDate);	
		System.out.println(passport.country);	
		System.out.println(passport.issuedDate);	
		System.out.println(passport.noOfLeafes);
		
		PassPort passport1=new PassPort("spoorthi");
		System.out.println(passport1.no);	
		System.out.println(passport1.name);	
		System.out.println(passport1.expiryDate);	
		System.out.println(passport1.country);	
		System.out.println(passport1.issuedDate);	
		System.out.println(passport1.noOfLeafes);
		
		
		PassPort passport2=new PassPort(14/15);
		System.out.println(passport2.no);	
		System.out.println(passport2.name);	
		System.out.println(passport2.expiryDate);	
		System.out.println(passport2.country);	
		System.out.println(passport2.issuedDate);	
		System.out.println(passport2.noOfLeafes);
		
		
		PassPort passport3=new PassPort("india",40);
		System.out.println(passport3.no);	
		System.out.println(passport3.name);	
		System.out.println(passport3.expiryDate);	
		System.out.println(passport3.country);	
		System.out.println(passport3.issuedDate);	
		System.out.println(passport3.noOfLeafes);
		
		PassPort passport4=new PassPort("sydney",13/14);
		System.out.println(passport4.no);	
		System.out.println(passport4.name);	
		System.out.println(passport4.expiryDate);	
		System.out.println(passport4.country);	
		System.out.println(passport4.issuedDate);	
		System.out.println(passport4.noOfLeafes);
		
		
		PassPort passport5=new PassPort(10);
		System.out.println(passport5.no);	
		System.out.println(passport5.name);	
		System.out.println(passport5.expiryDate);	
		System.out.println(passport5.country);	
		System.out.println(passport5.issuedDate);	
		System.out.println(passport5.noOfLeafes);
		
		
		PassPort passport6=new PassPort(8,"varun");
		System.out.println(passport6.no);	
		System.out.println(passport6.name);	
		System.out.println(passport6.expiryDate);	
		System.out.println(passport6.country);	
		System.out.println(passport6.issuedDate);	
		System.out.println(passport6.noOfLeafes);
		
		
	
	}
	
}
