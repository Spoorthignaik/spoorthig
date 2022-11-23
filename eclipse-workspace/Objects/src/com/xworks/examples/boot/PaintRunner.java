package com.xworks.examples.boot;

import com.xworks.examples.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint=new Paint();
		paint.setName("Tractor Emulsion");
		paint.setBrand("asian paint");
		paint.setPrice(500);
		paint.setQuality(true);
		paint.setSuitableFor("wall");
		paint.setShining(true);
		paint.setColor("blue");
		paint.setQuantity(1);
		paint.setType("emulsion");
		paint.setApplicationType("interior");
		
		Paint paint1=new Paint("Tractor Emulsion","asian paint",500,true,"true",true,"blue",2,"Eemulsion","interior");
		System.out.println(paint1);
		
		boolean same=paint.equals(paint1);
		System.out.println(same);
	}

}
