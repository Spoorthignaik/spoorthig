package com.xworkz.examples.dto;

public class CompanyCEO {

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualification;
	private boolean married;

	public CompanyCEO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEO(String name, String company, int age, String country, String qualification, boolean married) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
	}

	@Override
	public int hashCode() {
		return 50;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof CompanyCEO) {
				CompanyCEO dto=(CompanyCEO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching="+dto.name);
					return true;
				}
			}
		}
		
		return false;
	}
	

	@Override
	public String toString() {
		return "CompanyCEO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

}
