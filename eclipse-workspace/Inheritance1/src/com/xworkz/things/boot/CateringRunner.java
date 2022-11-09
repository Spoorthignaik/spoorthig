package com.xworkz.things.boot;

import com.xworkz.things.Catering;
import com.xworkz.things.EngagementCatering;

public class CateringRunner {

	public static void main(String[] args) {
		
		
		
		Catering catering1=new EngagementCatering(7000, "davngere", true);
		System.out.println(catering1.price);
		System.out.println(catering1.location);
		System.out.println(catering1.good);
		
	}

}
