package com.xworkz.examples;

public interface EmailRepository {
	
	boolean create(String email);
	
    default int total()
    {
		return 0;
	}

}
