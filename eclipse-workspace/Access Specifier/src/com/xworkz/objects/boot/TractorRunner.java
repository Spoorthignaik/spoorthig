package com.xworkz.objects.boot;

import com.xworkz.objects.Tractor;
import com.xworkz.objects.TractorAccess;

public class TractorRunner {

	public static void main(String[] args) {

		TractorAccess tractorAccess = new TractorAccess();
		Tractor tractor = new Tractor();

		System.out.println(tractor.getName());
		System.out.println(tractor.getBrand());
		System.out.println(tractor.getPrice());
		System.out.println(tractor.getColor());
		System.out.println(tractor.getHp());
		System.out.println(tractor.getModel());
		System.out.println(tractor.isWorking());
		System.out.println(tractor.getUsedFor());
		System.out.println(tractor.isTrending());
		System.out.println(tractor.isBest());
		System.out.println(tractor.getType());

		System.out.println(System.lineSeparator());
		tractorAccess.tractor1(tractor);
		
		

	}

}
