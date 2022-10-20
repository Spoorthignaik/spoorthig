package com.xworkz.programs.boot;

import com.xworkz.programs.TextTileShop;

public class TextTileRunner {

	public static void main(String[] args) {
		
		TextTileShop textTileShop=new TextTileShop();
		System.out.println(textTileShop.ownerName);
		System.out.println(textTileShop.ownerWifeName);	
		System.out.println(textTileShop.ownerDaughterName);	
		System.out.println(textTileShop.ownerDaughterNumber);	
		System.out.println(textTileShop.ownerNoOfWifes);	
		System.out.println(textTileShop.shopNo);	
		System.out.println(textTileShop.contactNo);
	

		TextTileShop textTileShop1=new TextTileShop("harish");
		System.out.println(textTileShop1.ownerName);
		System.out.println(textTileShop1.ownerWifeName);	
		System.out.println(textTileShop1.ownerDaughterName);	
		System.out.println(textTileShop1.ownerDaughterNumber);	
		System.out.println(textTileShop1.ownerNoOfWifes);	
		System.out.println(textTileShop1.shopNo);	
		System.out.println(textTileShop1.contactNo);
	
	

		TextTileShop textTileShop2=new TextTileShop("harish",710887902);
		System.out.println(textTileShop2.ownerName);
		System.out.println(textTileShop2.ownerWifeName);	
		System.out.println(textTileShop2.ownerDaughterName);	
		System.out.println(textTileShop2.ownerDaughterNumber);	
		System.out.println(textTileShop2.ownerNoOfWifes);	
		System.out.println(textTileShop2.shopNo);	
		System.out.println(textTileShop2.contactNo);
	
	
	

		TextTileShop textTileShop3=new TextTileShop("bharath",87890567,"hema");
		System.out.println(textTileShop3.ownerName);
		System.out.println(textTileShop3.ownerWifeName);	
		System.out.println(textTileShop3.ownerDaughterName);	
		System.out.println(textTileShop3.ownerDaughterNumber);	
		System.out.println(textTileShop3.ownerNoOfWifes);	
		System.out.println(textTileShop3.shopNo);	
		System.out.println(textTileShop3.contactNo);
	
	
	

		TextTileShop textTileShop4=new TextTileShop("vishal",876789089,"sushma,",2);
		System.out.println(textTileShop4.ownerName);
		System.out.println(textTileShop4.ownerWifeName);	
		System.out.println(textTileShop4.ownerDaughterName);	
		System.out.println(textTileShop4.ownerDaughterNumber);	
		System.out.println(textTileShop4.ownerNoOfWifes);	
		System.out.println(textTileShop4.shopNo);	
		System.out.println(textTileShop4.contactNo);
	

		TextTileShop textTileShop5=new TextTileShop("vishal",787678856,"sushma",5);
		System.out.println(textTileShop5.ownerName);
		System.out.println(textTileShop5.ownerWifeName);	
		System.out.println(textTileShop5.ownerDaughterName);	
		System.out.println(textTileShop5.ownerDaughterNumber);	
		System.out.println(textTileShop5.ownerNoOfWifes);	
		System.out.println(textTileShop5.shopNo);	
		System.out.println(textTileShop5.contactNo);
	
	

		TextTileShop textTileShop6=new TextTileShop("swami",767890432,"gowri",2,54,897006456);
		System.out.println(textTileShop6.ownerName);
		System.out.println(textTileShop6.ownerWifeName);	
		System.out.println(textTileShop6.ownerDaughterName);	
		System.out.println(textTileShop6.ownerDaughterNumber);	
		System.out.println(textTileShop6.ownerNoOfWifes);	
		System.out.println(textTileShop6.shopNo);	
		System.out.println(textTileShop6.contactNo);
	
	
	
	}
	
	
	
}
