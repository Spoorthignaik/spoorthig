package com.xworkz.examples.boot;

import com.xworkz.examples.SweetRepository;
import com.xworkz.examples.SweetRepositoryImp;

public class SweetRepositoryRunner {

	public static void main(String[] args) {
		
		
		SweetRepository sweet=new SweetRepositoryImp();
		sweet.name("kajuBurfi");
		sweet.name("Rasgulla");
		sweet.name("gulabJamun");
		sweet.name("champakali");
		sweet.name("laddu");
		sweet.name("peda");
		sweet.name("mysorepak");
		sweet.name("jilebi");
		
		System.out.println(sweet.total());
		
	}

}
