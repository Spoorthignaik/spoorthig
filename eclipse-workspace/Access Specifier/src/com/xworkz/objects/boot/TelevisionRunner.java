package com.xworkz.objects.boot;

import com.xworkz.objects.Television;
import com.xworkz.objects.TelevisionAccess;

public class TelevisionRunner {

	public static void main(String[] args) {

		TelevisionAccess televisionAccess = new TelevisionAccess();
		Television television = new Television();

		System.out.println(television.getName());
		System.out.println(television.getBrand());
		System.out.println(television.getPrice());
		System.out.println(television.getColor());
		System.out.println(television.isOld());
		System.out.println(television.getType());
		System.out.println(television.isWorking());
		System.out.println(television.getUsedFor());
		System.out.println(television.isTrending());
		System.out.println(television.isBest());
		System.out.println(television.isElectric());

		System.out.println(System.lineSeparator());
		televisionAccess.television1(television);

	}
		
	}


