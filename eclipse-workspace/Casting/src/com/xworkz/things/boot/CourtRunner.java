package com.xworkz.things.boot;

import com.xworkz.things.Court;
import com.xworkz.things.DistrictCourt;
import com.xworkz.things.HighCourt;
import com.xworkz.things.SupremeCourt;

public class CourtRunner {
	
	public static void main(String[] args) {
		
		Court court=new Court();
		System.out.println(court.name);
		System.out.println(court.type);
		
		Court court1=new HighCourt();
		HighCourt highCourt=(HighCourt)court1;
		System.out.println(highCourt.location);
		System.out.println(highCourt.noOfJudges);
		System.out.println(highCourt.name);
		System.out.println(highCourt.type);
		
		Court court2=new SupremeCourt();
		SupremeCourt supremeCourt=(SupremeCourt)court2;
		System.out.println(supremeCourt.nominees);
		System.out.println(supremeCourt.noOfstaffs);
		System.out.println(supremeCourt.name);
		System.out.println(supremeCourt.type);
		
		Court court3=new DistrictCourt();
		DistrictCourt districtCourt=(DistrictCourt)court3;
		System.out.println(districtCourt.noOfWorkingDays);
		System.out.println(districtCourt.govtHoliday);
		System.out.println(districtCourt.name);
		System.out.println(districtCourt.type);
		
		
		
		
		
		
		
		
		
		
	}

}
