package com.xworkz.programs.boot;


import com.xworkz.programs.*;
public class DistrictCollectorRunner{
	
	
	public static void main(String[] args) {
	
		DistrictCollector  dcName=new DistrictCollector();
		DistrictCollector dcAge=new DistrictCollector();
		DistrictCollector dcDistrict=new DistrictCollector();
		DistrictCollector dcBatchNo=new DistrictCollector();
	
		dcName.name="varun";
		dcAge.age=23;
		dcDistrict.district="shivamogga";
		dcBatchNo.batchNo=24;
		
		System.out.println(dcName.name);
		System.out.println(dcAge.age);
		System.out.println(dcDistrict.district);
		System.out.println(dcBatchNo.batchNo);
		
		
	}

}
