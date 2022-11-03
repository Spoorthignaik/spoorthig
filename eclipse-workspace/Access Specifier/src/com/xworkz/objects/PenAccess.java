package com.xworkz.objects;

public class PenAccess {

	public void pen1(Pen pen) {

		System.out.println(pen.getName());
		pen.setName("reynolds");
		System.out.println("modified name" + pen.getName());

		System.out.println(pen.getType());
		pen.setType("Ball");
		System.out.println("modified name"+pen.getType());
		
		System.out.println(pen.isDark());
		pen.setDark(true);
		System.out.println("modified name"+pen.isDark());
		
		System.out.println(pen.getColor());
		pen.setColor("brown");
		System.out.println("modified name"+pen.getColor());
		
		System.out.println(pen.isLight());
		pen.setLight(true);
		System.out.println("modified name"+pen.isLight());
		
		System.out.println(pen.getHeight());
		pen.setHeight(15.5);
		System.out.println("modified name"+pen.getHeight());
		
		System.out.println(pen.getCatridge());
		pen.setCatridge("red");
		System.out.println("modified name"+pen.getCatridge());
		
		System.out.println(pen.getBrand());
		pen.setBrand("Rorito");
		System.out.println("modified name"+pen.getBrand());
		
		System.out.println(pen.getBarCode());
		pen.setBarCode(466788);
		System.out.println("modified name"+pen.getBarCode());
		
		System.out.println(pen.isWorking());
		pen.setWorking(true);
		System.out.println("modified name"+pen.isWorking());
		
		
		
	}

}
