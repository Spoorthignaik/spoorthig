package com.xworkz.fi.dto;

public class InterviewDto {

	private String name;
	private String company;
	private String role;

	@Override
	public String toString() {
		return "InterviewDto [name=" + name + ", company=" + company + ", role=" + role + "]";
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getRole() {
		return role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
