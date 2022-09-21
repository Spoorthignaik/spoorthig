class ToothPasteRunner{
	
	public static void main(String[] dev){
	
	ToothPaste.properties();
	System.out.println("start");
	
	
	ToothPaste.setPrice(58);
	ToothPaste.setFlavour("neem");
	ToothPaste.setBrand("colgate");
	ToothPaste.setWeight(200d);
	ToothPaste.setTasty(true);
	ToothPaste.setGstApplied(true);
	ToothPaste.setHeight(150);
	ToothPaste.setOffer(true);
	ToothPaste.setType("ashwagandha");
	ToothPaste.setColors("red");
	ToothPaste.setGood(true);
	ToothPaste.setWidth(160f);
	ToothPaste.setIngredients("cloves");
	ToothPaste.setBarcode(162489l);
	ToothPaste.setRegistered(true);
	
	
	String ref1=ToothPaste.getPrice();
	System.out.println("price="+ref1);
	
	String ref2=ToothPaste.getFlavour();
	System.out.println("flavour="+ref2);
	
	String ref3=ToothPaste.getBrand();
	System.out.println("brand="+ref3);
	
	String ref4=ToothPaste.getWeight();
	System.out.println("weight="+ref4);
	
	String ref5=ToothPaste.isTasty();
	System.out.println("tasty="+ref5);
	
	String ref6=ToothPaste.isGstApplied();
	System.out.println("gstapplied="+ref6);
	
	String ref7=ToothPaste.getHeight();
	System.out.println("height="+ref7);
	
	String ref8=ToothPaste.isOffer();
	System.out.println("offer="+ref8);
	
	String ref9=ToothPaste.getType();
	System.out.println("type="+ref9);
	
	String ref10=ToothPaste.getColors();
	System.out.println("colors="+ref10);
	
	
	String ref11=ToothPaste.isGood();
	System.out.println("good="+ref11);
	
	
	String ref12=ToothPaste.getWidth();
	System.out.println("width="+ref12);
	
	String ref13=ToothPaste.getIngredients();
	System.out.println("ingredients="+ref13);
	
	String ref14=ToothPaste.getBarcode();
	System.out.println("barcode="+ref14);
	
	String ref15=ToothPaste.isRegisterd();
	System.out.println("registered="+ref15);
	
	
	
	
	
	}
	
}