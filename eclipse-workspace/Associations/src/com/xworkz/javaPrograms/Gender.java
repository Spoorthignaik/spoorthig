package com.xworkz.javaPrograms;

public enum Gender {

	MALE("Male"), FEMALE("Female"), TRANSGENDER("Transgender");

	public String name;

	private Gender(String name) {
		this.name = name;
	}

}
