class Vehicle{
	
	static double transport(String source,String destination){
		
	System.out.println("source and destination");
    
    if(source=="shivamogga"&&destination=="banglore")
	{
    System.out.println("source and destination="+source+destination);
    return 274.5;
	}
	
    if(sourrce=="tumkur"&&destination=="banglore")
	{	
	System.out.println("source and destination="+source+destination);	
    return 60;
	}
	
   if(sourrce=="chennai"&&destination=="banglore")
	{	
	System.out.println("source and destination="+source+destination);	
    return 350;
	}
	
    static boolean transport(String destination)
	{
	System.out.println("destination arrived");
   return true;			
	}
	
	if(destination=="not reached")
	{
	System.out.println("destination  not arrived");
	}
	return false;
	}
			
	}

	static boolean transport(boolean ontime){
	System.out.println("entered transport which is ontime");

     if(ontime==true){
   System.out.println("arrived on time");
    return true;   
	 }

	 
   if(ontime==false){
   System.out.println("not arrived on time");
    return false;   
	 }	 
		
		
	}
	
	
	
}