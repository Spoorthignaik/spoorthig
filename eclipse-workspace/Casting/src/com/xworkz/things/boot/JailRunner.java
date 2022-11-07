package com.xworkz.things.boot;

import com.xworkz.things.CentralJail;
import com.xworkz.things.DistrictJail;
import com.xworkz.things.Jail;
import com.xworkz.things.SubJail;

public class JailRunner {
	
	public static void main(String[] args) {

		Jail jail = new Jail();
		System.out.println(jail.name);
		System.out.println(jail.location);

		Jail jail1 = new CentralJail();
		CentralJail centralJail = (CentralJail) jail1;
		System.out.println(centralJail.noOfCulprist);
		System.out.println(centralJail.noOfCulprist);
		System.out.println(centralJail.name);
		System.out.println(centralJail.location);

		Jail jail2 = new SubJail();
		SubJail subJail = (SubJail) jail2;
		System.out.println(subJail.noOfCases);
		System.out.println(subJail.noOfCells);
		System.out.println(subJail.name);
		System.out.println(subJail.location);

		Jail jail3 = new DistrictJail();
		DistrictJail districtJail = (DistrictJail) jail3;
		System.out.println(districtJail.address);
		System.out.println(districtJail.strict);
		System.out.println(districtJail.name);
		System.out.println(districtJail.location);

	}
}
