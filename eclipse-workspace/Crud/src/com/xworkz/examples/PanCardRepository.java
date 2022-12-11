package com.xworkz.examples;

public interface PanCardRepository {
	
	boolean id (String panCard);
	default int total() {
		return 0;
	}

}
