package com.xworkz.objects.boot;

import com.xworkz.objects.Coffe;
import com.xworkz.objects.CoffeAccess;

public class CoffeRunner {

	public static void main(String[] args) {
		

		CoffeAccess coffeAccess = new CoffeAccess();
		Coffe coffe = new Coffe();

		System.out.println(coffe.getName());
		System.out.println(coffe.getBrand());

		System.out.println(coffe.getPrice());
		System.out.println(coffe.getColor());
		System.out.println(coffe.isTasty());
		System.out.println(coffe.isGood());
		System.out.println(coffe.getBarCode());
		System.out.println(coffe.getCalories());
		System.out.println(coffe.isSweet());
		System.out.println(coffe.getType());
		System.out.println(coffe.getIngredient());

		System.out.println(System.lineSeparator());
		coffeAccess.coffe1(coffe);
		
		
		}
		
		
		
	}


