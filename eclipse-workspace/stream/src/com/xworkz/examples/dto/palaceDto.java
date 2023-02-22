package com.xworkz.examples.dto;

public class palaceDto {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFees;

	public palaceDto() {

	}

	public palaceDto(String name, String location, String builtBy, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public int hashCode() {

		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof palaceDto) {
				palaceDto dto=(palaceDto)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching ="+dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "palaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
