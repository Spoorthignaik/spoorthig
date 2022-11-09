package com.xworkz.things.boot;

import com.xworkz.things.ArrangeMarriage;
import com.xworkz.things.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {


		Marriage marriage1 = new ArrangeMarriage("davangere", 500, "harish");
		System.out.println(marriage1.location);
		System.out.println(marriage1.noOfMembers);
		System.out.println(marriage1.name);

		
	}

}
