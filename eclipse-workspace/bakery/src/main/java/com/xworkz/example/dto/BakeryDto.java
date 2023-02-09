package com.xworkz.example.dto;

public class BakeryDto {

	private String name;
	private String ownerName;
	private String wife;
	private boolean married;
	private boolean famous;
	private long since;

	public BakeryDto(String name, String ownerName, String wife, boolean married, boolean famous, long since) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.wife = wife;
		this.married = married;
		this.famous = famous;
		this.since = since;
	}

	@Override
	public String toString() {
		return "BakeryDto [name=" + name + ", ownerName=" + ownerName + ", wife=" + wife + ", married=" + married
				+ ", famous=" + famous + ", since=" + since + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getWife() {
		return wife;
	}

	public boolean isMarried() {
		return married;
	}

	public boolean isFamous() {
		return famous;
	}

	public long getSince() {
		return since;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setFamous(boolean famous) {
		this.famous = famous;
	}

	public void setSince(long since) {
		this.since = since;
	}

}
