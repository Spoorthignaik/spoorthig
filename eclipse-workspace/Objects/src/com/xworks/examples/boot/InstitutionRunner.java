package com.xworks.examples.boot;

import com.xworks.examples.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		
		Institution institute=new Institution();
		institute.setName("xworkz");
		institute.setFees(22000);
		institute.setNoOfStaffs(15);
		institute.setNoOfFloors(2);
		institute.setNoOfHR(2);
		institute.setNoOfStudents(200);
		institute.setType("training");
		institute.setNoOfTrainers(10);
		institute.setLibrary(false);
		institute.setFamous(true);
		
		
		Institution institute1=new Institution("q spider", 35000, 15, 2, 2, 200, "training", 15, false, false);

		boolean same=institute.equals(institute1);
		System.out.println(same);
		
	}

}
