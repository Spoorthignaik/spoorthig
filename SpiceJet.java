class  SpiceJet{
	
	static void spiceJetno (String flightNos){
		
	System.out.println("entered flight numbers");
    System.out.println(" spice jet numbers:"+flightNos);
    for(int index=0 ; index<flightNos.length; index++)
	{
		
		String spiceJetno=flightNos[index];
		System.out.println(spiceJetno);
		

		
	}
	System.out.println("exit");
	
	}
	
	
}