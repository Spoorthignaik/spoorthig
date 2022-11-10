package com.xworkz.things.boot;

import com.xworkz.things.PayingGuest;

public class HomeRunner {

	public static void main(String[] args) {
		
		PayingGuest payingGuest=new PayingGuest();
	    payingGuest.stay();
		payingGuest.payRent();
	}

}
