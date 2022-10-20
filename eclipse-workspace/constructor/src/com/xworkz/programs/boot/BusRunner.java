package com.xworkz.programs.boot;

import com.xworkz.programs.Bus;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Bus Busno=new Bus();	
   Busno.no=1;
	System.out.println(Busno.no);	
		
	 Bus BusStarting=new Bus();
	BusStarting.starting="mahakaviKuvempuRoad";
	System.out.println(BusStarting.starting);
	

	 Bus BusDestination=new Bus();
		BusDestination.destination="majestic";
		System.out.println(BusDestination.destination);
	
	
	}

}
