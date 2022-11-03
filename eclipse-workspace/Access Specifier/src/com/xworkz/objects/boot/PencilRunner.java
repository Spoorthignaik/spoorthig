package com.xworkz.objects.boot;

import com.xworkz.objects.Pencil;
import com.xworkz.objects.PencilAccess;

public class PencilRunner {

	public static void main(String[] args) {

	PencilAccess pencilAccess = new  PencilAccess();
	Pencil  pencil = new  Pencil();

	System.out.println(pencil.getName());
	System.out.println(pencil.getPrice());
	System.out.println(pencil.isDark());
	System.out.println(pencil.isLight());
	System.out.println(pencil.getHeight());
	System.out.println(pencil.getShape());
	System.out.println(pencil.getColors());
	System.out.println(pencil.getBrands());
	System.out.println(pencil.isLead());
	System.out.println(pencil.getType());
	System.out.println(pencil.isWorking());

	System.out.println(System.lineSeparator());
	pencilAccess.pencil1(pencil);

}

}
