class SpiceJetRunner{
	
	public static void main(String[] numbers){
	
	System.out.println("entered spice jet numbers");
	
	String[] flights1={"DB647","BA1326","BA1476"};
	String[] flights2={"XZ647","AB1326","CD1476"};
	String[] flights3={"QF47","SV1326","VS1476"};
	String[] flights5={"VV647","SS1326","GS1476"};
	String[] flights6={"RS647","MD1326","DM1476"};
	String[] flights7={"UB647","BU1326","PO1476"};
	String[] flights8={"OP647","QN1326","NQ1476"};
	String[] flights9={"HG647","GH1326","BK1476"};
	String[] flights10={"KB647","SO1326","HI1476"};

    SpiceJet.spiceJetno(flights1);
     SpiceJet.spiceJetno(flights2);
	 SpiceJet.spiceJetno(flights3);
	 SpiceJet.spiceJetno(flights4);
	 SpiceJet.spiceJetno(flights5);
     SpiceJet.spiceJetno(flights6);	 
	 SpiceJet.spiceJetno(flights7);
	  SpiceJet.spiceJetno(flights8);
	 SpiceJet.spiceJetno(flights9);
	 SpiceJet.spiceJetno(flights10);
	
	System.out.println("end");
	}
	
}