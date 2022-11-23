package com.xworks.examples.boot;

import com.xworks.examples.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("bike");
		vehicle.setBrand("r15");
		vehicle.setType("old");
		vehicle.setPrice(1250000);
		vehicle.setUsedFor("riding");
		vehicle.setFast(false);
		vehicle.setColor("black");
		vehicle.setMaterial("metal");
		vehicle.setModel(2018);
		vehicle.setBatteryRequired(true);

		
		Vehicle vehicle2=new Vehicle("bike", "r15","old" , 12500000, "riding", false, "black", "metal", 2018, true);
        System.out.println(vehicle2);
        
        boolean same=vehicle.equals(vehicle2);
        System.out.println(same);
	}

}
