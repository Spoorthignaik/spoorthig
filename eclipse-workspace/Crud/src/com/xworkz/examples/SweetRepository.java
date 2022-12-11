package com.xworkz.examples;

public interface SweetRepository {
	
	boolean name(String name);
	
	default int total() {
		return 0;
	}

}
