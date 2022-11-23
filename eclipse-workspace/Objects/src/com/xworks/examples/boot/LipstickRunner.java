package com.xworks.examples.boot;

import com.xworks.examples.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		
		Lipstick lipstick=new Lipstick();
		lipstick.setBrand("nivea");
		lipstick.setType("bottle");
		lipstick.setColor("red");
		lipstick.setPrice(300);
		lipstick.setGood(true);
		lipstick.setWaterProof(true);
		lipstick.setItemForm("liquid");
		lipstick.setNoOfShades(100);
		lipstick.setCountryOfOrigin("china");
		lipstick.setQuantity(25);
		
		Lipstick lipstick1=new Lipstick("nivea", "bottle", "red", 300, true, true, "liquid", 100, "china", 25);
		

				boolean same=lipstick.equals(lipstick1);
				System.out.println(same);

	}

}
