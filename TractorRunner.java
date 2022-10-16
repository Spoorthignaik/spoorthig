package com.xworkz.programs.boot;

import com.xworkz.programs.*;

public class TractorRunner {

	public static void main(String[] args) {
	
		Tractor tractor=new Tractor();
		System.out.println(tractor.name);	
		System.out.println(tractor.brand);	
		System.out.println(tractor.price);	
		System.out.println(tractor.color);	
		System.out.println(tractor.hp);	
		System.out.println(tractor.model);
	
	
		Tractor tractor1=new Tractor("mahindra","newHolland");
		System.out.println(tractor1.name);	
		System.out.println(tractor1.brand);	
		System.out.println(tractor1.price);	
		System.out.println(tractor1.color);	
		System.out.println(tractor1.hp);	
		System.out.println(tractor1.model);
		

		Tractor tractor2=new Tractor("mahindra","newHolland",600000);
		System.out.println(tractor2.name);	
		System.out.println(tractor2.brand);	
		System.out.println(tractor2.price);	
		System.out.println(tractor2.color);	
		System.out.println(tractor2.hp);	
		System.out.println(tractor2.model);
		
		

		Tractor tractor3=new Tractor("mahindra","newHolland",600000,"red");
		System.out.println(tractor3.name);	
		System.out.println(tractor3.brand);	
		System.out.println(tractor3.price);	
		System.out.println(tractor3.color);	
		System.out.println(tractor3.hp);	
		System.out.println(tractor3.model);
		

		Tractor tractor4=new Tractor("mahindra","newHolland",600000,"grey",45);
		System.out.println(tractor4.name);	
		System.out.println(tractor4.brand);	
		System.out.println(tractor4.price);	
		System.out.println(tractor4.color);	
		System.out.println(tractor4.hp);	
		System.out.println(tractor4.model);
		
		

		Tractor tractor5=new Tractor("mahindra","newHolland",500000,"blue",50,56748);
		System.out.println(tractor5.name);	
		System.out.println(tractor5.brand);	
		System.out.println(tractor5.price);	
		System.out.println(tractor5.color);	
		System.out.println(tractor5.hp);	
		System.out.println(tractor5.model);
		
		
	
	
	
	}	
	
}
