package com.xworks.examples;

public class God {
	
	
	private String name;
	private String gender;
	private String weapons;
	private String power;
	private String anotherName;
	private int noOfAvatharas;
	private String avatarName;
	private boolean temple;
	private int noOfTemples;
	private String location;
	
	public God() {
		System.out.println("created default constructor");
	}
	
	
	
	
	public God(String name, String gender, String weapons, String power, String anotherName, int noOfAvatharas,
			String avatarName, boolean temple, int noOfTemples, String location) {
		super();
		this.name = name;
		this.gender = gender;
		this.weapons = weapons;
		this.power = power;
		this.anotherName = anotherName;
		this.noOfAvatharas = noOfAvatharas;
		this.avatarName = avatarName;
		this.temple = temple;
		this.noOfTemples = noOfTemples;
		this.location = location;
	}




	@Override
	public String toString() {
		return "God [name=" + name + ", gender=" + gender + ", weapons=" + weapons + ", power=" + power
				+ ", anotherName=" + anotherName + ", noOfAvatharas=" + noOfAvatharas + ", avatarName=" + avatarName
				+ ", temple=" + temple + ", noOfTemples=" + noOfTemples + ", location=" + location + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getWeapons()=" + getWeapons() + ", getPower()="
				+ getPower() + ", getAnotherName()=" + getAnotherName() + ", getNoOfAvatharas()=" + getNoOfAvatharas()
				+ ", getAvatarName()=" + getAvatarName() + ", isTemple()=" + isTemple() + ", getNoOfTemples()="
				+ getNoOfTemples() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public boolean equals(Object obj) {

		if (obj instanceof God) {
			God god = (God) obj;
			if (this.name.equals(god.name) && this.anotherName.equals(god.anotherName) && this.gender.equals(god.gender)
					&& this.weapons.equals(god.weapons) && this.location.equals(god.location)) {

				System.out.println("All properties are equal");
				return true;

			}

			else {
				System.out.println("These properties are not equal");
			}

		}
		return false;

	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getAnotherName() {
		return anotherName;
	}
	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}
	public int getNoOfAvatharas() {
		return noOfAvatharas;
	}
	public void setNoOfAvatharas(int noOfAvatharas) {
		this.noOfAvatharas = noOfAvatharas;
	}
	public String getAvatarName() {
		return avatarName;
	}
	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}
	public boolean isTemple() {
		return temple;
	}
	public void setTemple(boolean temple) {
		this.temple = temple;
	}
	public int getNoOfTemples() {
		return noOfTemples;
	}
	public void setNoOfTemples(int noOfTemples) {
		this.noOfTemples = noOfTemples;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
