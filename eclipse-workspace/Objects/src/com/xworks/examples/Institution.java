package com.xworks.examples;

public class Institution {
	
	
	private String name;
	private double fees;
	private int noOfStaffs;
	private int noOfFloors;
	private int noOfHR;
	private int noOfStudents;
	private String type;
	private int noOfTrainers;
	private boolean library;
	private boolean famous;
	
	public Institution() {
		System.out.println("created default constructor");
	}
	
	
	public Institution(String name, double fees, int noOfStaffs, int noOfFloors, int noOfHR, int noOfStudents,
			String type, int noOfTrainers, boolean library, boolean famous) {
		super();
		this.name = name;
		this.fees = fees;
		this.noOfStaffs = noOfStaffs;
		this.noOfFloors = noOfFloors;
		this.noOfHR = noOfHR;
		this.noOfStudents = noOfStudents;
		this.type = type;
		this.noOfTrainers = noOfTrainers;
		this.library = library;
		this.famous = famous;
	}
	
	


	@Override
	public String toString() {
		return "Institution [name=" + name + ", fees=" + fees + ", noOfStaffs=" + noOfStaffs + ", noOfFloors="
				+ noOfFloors + ", noOfHR=" + noOfHR + ", noOfStudents=" + noOfStudents + ", type=" + type
				+ ", noOfTrainers=" + noOfTrainers + ", library=" + library + ", famous=" + famous + ", getName()="
				+ getName() + ", getFees()=" + getFees() + ", getNoOfStaffs()=" + getNoOfStaffs() + ", getNoOfFloors()="
				+ getNoOfFloors() + ", getNoOfHR()=" + getNoOfHR() + ", getNoOfStudents()=" + getNoOfStudents()
				+ ", getType()=" + getType() + ", getNoOfTrainers()=" + getNoOfTrainers() + ", isLibrary()="
				+ isLibrary() + ", isFamous()=" + isFamous() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean equals(Object obj) {

		if (obj instanceof Institution) {
			Institution institution = (Institution) obj;
			if (this.name.equals(institution.name) && this.type.equals(institution.type)) {

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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getNoOfStaffs() {
		return noOfStaffs;
	}
	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getNoOfHR() {
		return noOfHR;
	}
	public void setNoOfHR(int noOfHR) {
		this.noOfHR = noOfHR;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public boolean isLibrary() {
		return library;
	}
	public void setLibrary(boolean library) {
		this.library = library;
	}
	public boolean isFamous() {
		return famous;
	}
	public void setFamous(boolean famous) {
		this.famous = famous;
	}
	
	

}
