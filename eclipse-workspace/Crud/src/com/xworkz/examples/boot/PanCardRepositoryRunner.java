package com.xworkz.examples.boot;

import com.xworkz.examples.PanCardRepository;
import com.xworkz.examples.PanCardRepositoryImp;

public class PanCardRepositoryRunner {

	public static void main(String[] args) {
		
		PanCardRepository pan=new PanCardRepositoryImp();
		pan.id("IB567");
		pan.id("AS567");
		pan.id("VS567");
		pan.id("SA567");
		pan.id("BY567");
		pan.id("YF567");
		pan.id("TDX567");
		pan.id("YU67");
		pan.id("OU567");
		pan.id("PP567");
		System.out.println(pan.total());

	}

}
