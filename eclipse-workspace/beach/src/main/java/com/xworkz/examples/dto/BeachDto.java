package com.xworkz.examples.dto;

public class BeachDto {
	
	private String name;
	private String location;
	private boolean  clean;
	private  String games;
	
	public BeachDto() {
		System.out.println("created BeachDto");
	}

	@Override
	public String toString() {
		return "BeachDto [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public boolean isClean() {
		return clean;
	}

	public String getGames() {
		return games;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public void setGames(String games) {
		this.games = games;
	}

	
	
}
