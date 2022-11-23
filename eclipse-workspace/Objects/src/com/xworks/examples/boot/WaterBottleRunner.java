package com.xworks.examples.boot;

import com.xworks.examples.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		
		WaterBottle water=new WaterBottle();
		water.setName("bisleri");
		water.setBrand("bindu");
		water.setPrice(20);
		water.setColor("black");
		water.setMaterial("plastic");
		water.setWeight(160.5);
		water.setCapacity(3);
		water.setType("designed");
		water.setModel("pvr");
		water.setGood(true);
		
		

		WaterBottle water1=new WaterBottle("bindu jeera", "bindu", 20, "black", "plastic", 150.5, 2, "designed", "pvr", false);
		
		boolean same=water.equals(water1);
		System.out.println(same);
	}

}
