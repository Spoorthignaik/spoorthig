package com.xworkz.examples.dto;

public class place {
	
	private String name;
	private String famousFor;
	private int noOFTaluk;
	
	
	public place() {
		super();
	}


	public place(String name, String famousFor, int noOFTaluk) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.noOFTaluk = noOFTaluk;
	}

     public boolean equals(Object obj) {
		
		System.out.println("running equals from place dto");
		if(obj!=null) {
			if(obj instanceof place) {
				place dto=(place)obj;
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
		return "place [name=" + name + ", famousFor=" + famousFor + ", noOFTaluk=" + noOFTaluk + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFamousFor() {
		return famousFor;
	}


	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}


	public int getNoOFTaluk() {
		return noOFTaluk;
	}


	public void setNoOFTaluk(int noOFTaluk) {
		this.noOFTaluk = noOFTaluk;
	}
	
	
	

}
