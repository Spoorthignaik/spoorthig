class  TextTiles{
	
	static String typeOfDress;
	static double  shirtSize;
	static int numberOfShirts;
	static  String brand;
	static  boolean good;
	static boolean trending;
	static int numberOfPants;
	static int numberOfKurtis;
	static double  pantSize;
	static int numberOfSarees;
	static boolean gstApplied;
	static boolean offers;
	static String[] colors;
	{
     System.out.println(typeOfDress);
	 System.out.println(shirtSize);
	 System.out.println(numberOfShirts);
	 System.out.println(brand);  
     System.out.println(good);
     System.out.println(trending);
     System.out.println(numberOfPants);
     System.out.println(numberOfKurtis);
     System.out.println(pantSize);
	 System.out.println(numberOfSarees);
     System.out.println(gstApplied);
     System.out.println(offers);
     System.out.println(colors);
     if(colors!=null)
	 {
	 System.out.println("array is pointing to a memory");
	for(int loop=0; loop<=colors.length-1; loop++)
	{
	String ref=colors[loop];	
	System.out.println(ref+"loop"+ref);
	}
	System.out.println("exit");
	
	 }
	 
	}
	
}