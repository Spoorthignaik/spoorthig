package com.xworkz.examples.dto;

public class gameDto {
	
	private String name;
	private String type;
	private int noOfPlayers;
	
	
	public gameDto() {
		super();
	}


	public gameDto(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	public boolean equals(Object obj) {
		
		System.out.println("running equals from game dto");
		if(obj!=null) {
			if(obj instanceof gameDto) {
				gameDto dto=(gameDto)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "gameDto [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getNoOfPlayers() {
		return noOfPlayers;
	}


	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	
	

}
