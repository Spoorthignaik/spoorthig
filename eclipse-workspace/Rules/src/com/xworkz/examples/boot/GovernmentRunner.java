package com.xworkz.examples.boot;

import com.xworkz.examples.CommonPeople;
import com.xworkz.examples.Government;

public class GovernmentRunner {

	public static void main(String[] args) {
		
		
		Government govt=new CommonPeople();
		CommonPeople people=new CommonPeople();
		
		people.payGst();

	}

}
