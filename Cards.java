class Cards{
	
	static String  type;
	static double height;
	static float width;
	static double price;
	static String[]colors;
	{
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	System.out.println(colors);
	if(colors!=null)
	{
	System.out.println("array is pointing to a memory");
	for(int position=0; position<=colors.length-1; position++)
	{
	String ref=colors[position];
    System.out.println(ref+"position"+ref);	
			
	}
	
	}
	
	}
}
