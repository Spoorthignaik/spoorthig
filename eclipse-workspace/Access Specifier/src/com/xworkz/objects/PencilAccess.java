package com.xworkz.objects;

public class PencilAccess {
	
public Pencil pencil;
	
	public void  pencil1(Pencil pencil) {
		
		System.out.println(pencil.getName());
		pencil.setName("black pencil");
		System.out.println("modified name"+pencil.getName());
		
		System.out.println(pencil.getType());
		pencil.setType("small");
		System.out.println("modified name"+pencil.getType());
		
		System.out.println(pencil.isDark());
		pencil.setDark(true);
		System.out.println("modified name"+pencil.isDark());
		
		System.out.println(pencil.getColors());
		pencil.setColors("black");
		System.out.println("modified name"+pencil.getColors());
		
		System.out.println(pencil.isLight());
		pencil.setLight(true);
		System.out.println("modified name"+pencil.isLight());
		
		System.out.println(pencil.getHeight());
		pencil.setHeight(15.0);
		System.out.println("modified name"+pencil.getHeight());
		
		System.out.println(pencil.getShape());
		pencil.setShape("round");
		System.out.println("modified name"+pencil.getShape());
		
		System.out.println(pencil.getBrands());
		pencil.setBrands("nataraja");
		System.out.println("modified name"+pencil.getBrands());
		
		System.out.println(pencil.isLead());
		pencil.setLead(false);
		System.out.println("modified name"+pencil.isLead());
		
		System.out.println(pencil.isWorking());
		pencil.setWorking(true);
		System.out.println("modified name"+pencil.isWorking());
		
		
		
	}
	
	

}
