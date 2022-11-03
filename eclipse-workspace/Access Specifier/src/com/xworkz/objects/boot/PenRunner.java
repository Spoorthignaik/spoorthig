package com.xworkz.objects.boot;

import com.xworkz.objects.Pen;
import com.xworkz.objects.PenAccess;

public class PenRunner {
	
	public static void main(String[] args) {

		PenAccess penAccess = new PenAccess();
		Pen pen = new Pen();

		System.out.println(pen.getName());
		System.out.println(pen.getPrice());
		System.out.println(pen.isDark());
		System.out.println(pen.isLight());
		System.out.println(pen.getHeight());
		System.out.println(pen.getCatridge());
		System.out.println(pen.getColor());
		System.out.println(pen.getBrand());
		System.out.println(pen.getBarCode());
		System.out.println(pen.getType());
		System.out.println(pen.isWorking());

		System.out.println(System.lineSeparator());
		penAccess.pen1(pen);

	}

}
