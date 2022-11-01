package com.xworkz.javaPrograms;

public class Job {
	
	public double salary;
	public String role;
	public boolean bond;
	public Company1 company1;
	
	
	public Job(double salary, String role, boolean bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void setCompany1(Company1 company1) {
		this.company1=company1;
	}

	public void showOff6()
	{
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		
		if (company1 != null) {
			System.out.println(" ------------");
			this.company1.showOff5();

		} else {
			System.out.println("not running company");
		}
	}
	
}
 