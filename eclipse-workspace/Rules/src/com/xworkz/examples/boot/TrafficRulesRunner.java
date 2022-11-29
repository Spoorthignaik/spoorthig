package com.xworkz.examples.boot;

import com.xworkz.examples.TrafficRules;
import com.xworkz.examples.VehicleRiders;

public class TrafficRulesRunner {
	
	
	public static void main(String[] args) {
		
		TrafficRules traffic=new VehicleRiders();
		VehicleRiders vehicle=new VehicleRiders();
		
		vehicle.followTrafficSignals();
		
	}

}
