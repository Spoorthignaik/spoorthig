package com.xworkz.things;

public class PayingGuest extends Home {
	
   @Override
	public void stay() {
		super.stay();
		System.out.println("running Stay");
	}

}
