package com.xworkz.objects.boot;

import com.xworkz.objects.Shirt;
import com.xworkz.objects.ShirtAccess;

public class ShirtRunner {

	public static void main(String[] args) {

		ShirtAccess shirtAccess = new ShirtAccess();
		Shirt shirt = new Shirt();

		System.out.println(shirt.getName());
		System.out.println(shirt.getBrand());
		System.out.println(shirt.getPrice());
		System.out.println(shirt.getColor());
		System.out.println(shirt.isFit());
		System.out.println(shirt.isPockets());
		System.out.println(shirt.getPatterns());
		System.out.println(shirt.isFashionable());
		System.out.println(shirt.isQuality());
		System.out.println(shirt.getType());
		System.out.println(shirt.isOld());

		System.out.println(System.lineSeparator());
		shirtAccess.shirt1(shirt);

	}

}
