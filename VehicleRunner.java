class VehicleRunner{
	public static void main(String[] cable){
	
     double distance=Vehicle.transport("shivamogga","banglore");
     System.out.println("distance="+distance);

    Vehicle.transport("shivamogga","banglore","yes");
	  Vehicle.transport("shivamogga","banglore","no");
	
	Vehicle.	transport("not arrived");
	Vehicle.	transport(" arrived");	
	Vehicle.	transport(true);
	Vehicle.	transport(false);	
		
		
	
	
	}
	
	
}