package com.xworks.examples.boot;

import com.xworks.examples.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("subbaiah medical institute");
		hospital.setNoOfBeds(1000);
		hospital.setNoOfFloors(7);
		hospital.setFamous(true);
		hospital.setNoOfDoctors(100);
		hospital.setClean(true);
		hospital.setLocation("shivamogga");
		hospital.setNoOfPatient(13456);
		hospital.setOwnerName("subbaiah");
		hospital.setNoOfRooms(50);
		
		
		Hospital hospital2=new Hospital("subbaiah medical institute",1000,7,true,100,true,"shivamogga",13456,"subbaiah",50);
		  System.out.println(hospital2);
	        
	        boolean same=hospital.equals(hospital2);
	        System.out.println(same);
		
		
	}

}
