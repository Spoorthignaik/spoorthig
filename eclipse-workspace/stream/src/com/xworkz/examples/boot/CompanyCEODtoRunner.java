package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.CompanyCEO;

public class CompanyCEODtoRunner {

	public static void main(String[] args) {
		
		
		Collection<CompanyCEO>company=new ArrayList<CompanyCEO>();
		company.add(new CompanyCEO("varun","Varun Products", 24, "india", "BE", true));
		company.add(new CompanyCEO("vihal","Vijya nanda", 25, "newzelnd", "BCA", false));
		company.add(new CompanyCEO("hari","Varun Products", 26, "india", "MCA", true));
		company.add(new CompanyCEO("suman","Varun Products", 27, "Australia", "BCOM", true));
		company.add(new CompanyCEO("spoorthi","Varun Products", 28, "sydney", "BSC", false));

	}

}
