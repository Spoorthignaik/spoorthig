package com.xworks.examples;

public class Hospital {
	
	
	private String name;
	private int noOfFloors;
	private int noOfBeds;
	private boolean famous;
	private int noOfDoctors;
	private boolean clean;
	private String location;
	private int noOfPatient;
	private String ownerName;
	private int noOfRooms;
	
	public Hospital() {
		System.out.println("created default constructor");
	}
	
	
	
	public Hospital(String name, int noOfFloors, int noOfBeds, boolean famous, int noOfDoctors, boolean clean,
			String location, int noOfPatient, String ownerName, int noOfRooms) {
		super();
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.noOfBeds = noOfBeds;
		this.famous = famous;
		this.noOfDoctors = noOfDoctors;
		this.clean = clean;
		this.location = location;
		this.noOfPatient = noOfPatient;
		this.ownerName = ownerName;
		this.noOfRooms = noOfRooms;
	}



	@Override
	public String toString() {
		return "Hospital [name=" + name + ", noOfFloors=" + noOfFloors + ", noOfBeds=" + noOfBeds + ", famous=" + famous
				+ ", noOfDoctors=" + noOfDoctors + ", clean=" + clean + ", location=" + location + ", noOfPatient="
				+ noOfPatient + ", ownerName=" + ownerName + ", noOfRooms=" + noOfRooms + ", getName()=" + getName()
				+ ", getNoOfFloors()=" + getNoOfFloors() + ", getNoOfBeds()=" + getNoOfBeds() + ", isFamous()="
				+ isFamous() + ", getNoOfDoctors()=" + getNoOfDoctors() + ", isClean()=" + isClean()
				+ ", getLocation()=" + getLocation() + ", getNoOfPatient()=" + getNoOfPatient() + ", getOwnerName()="
				+ getOwnerName() + ", getNoOfRooms()=" + getNoOfRooms() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public boolean equals(Object obj) {

		if (obj instanceof Hospital) {
			Hospital hospital = (Hospital) obj;
			if (this.name.equals(hospital.name) && this.ownerName.equals(hospital.ownerName)) {

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
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	public boolean isFamous() {
		return famous;
	}
	public void setFamous(boolean famous) {
		this.famous = famous;
	}
	public int getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfPatient() {
		return noOfPatient;
	}
	public void setNoOfPatient(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

}
