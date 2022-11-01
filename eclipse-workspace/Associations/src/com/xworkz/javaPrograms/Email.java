package com.xworkz.javaPrograms;

public class Email {
	
	public String id;
	public long passWord;
	public long mobileNumber;
	public Company1 company1;
	
	
	public Email(String id, long passWord, long mobileNumber) {
		super();
		this.id = id;
		this.passWord = passWord;
		this.mobileNumber = mobileNumber;
	}
	
	public void setCompany1()
	{
		this.company1=company1;
		
	}
	public void showOff7() {
		System.out.println(this.id);
		System.out.println(this.passWord);
		System.out.println(this.mobileNumber);
		if (company1 != null) {
			System.out.println(" ------------");
			this.company1.showOff5();

		} else {
			System.out.println("not running company");
		}
		
	}
	
	
	
	
	
	
	
	

}
