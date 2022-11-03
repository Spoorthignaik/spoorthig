package com.xworkz.objects.boot;

import com.xworkz.objects.Pant;
import com.xworkz.objects.PantAccess;

public class PantRunner {

	public static void main(String[] args) {

		PantAccess pantAccess = new PantAccess();
		Pant pant = new Pant();

		System.out.println(pant.getName());
		System.out.println(pant.getBrand());
		System.out.println(pant.getPrice());
		System.out.println(pant.getColor());
		System.out.println(pant.isFit());
		System.out.println(pant.isPockets());
		System.out.println(pant.getPatterns());
		System.out.println(pant.isFashionable());
		System.out.println(pant.isQuality());
		System.out.println(pant.getType());
		System.out.println(pant.isOld());

		System.out.println(System.lineSeparator());
		pantAccess.pant1(pant);

	}

}
