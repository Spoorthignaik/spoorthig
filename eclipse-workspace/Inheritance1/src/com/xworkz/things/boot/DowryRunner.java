package com.xworkz.things.boot;

import com.xworkz.things.Dowry;
import com.xworkz.things.Property;

public class DowryRunner {

	public static void main(String[] args) {
		
		Dowry dowry=new Property(10000,"gold",false);
		System.out.println(dowry.legal);
		System.out.println(dowry.price);
		System.out.println(dowry.type);

	}

}
