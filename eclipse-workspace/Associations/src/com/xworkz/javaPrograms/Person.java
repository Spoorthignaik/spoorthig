package com.xworkz.javaPrograms;

public class Person {
	
	public String name;
	public Email[] email;
	public Job job;
	
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void serEmail(Email[] email)
	{
		this.email=email;
		
	}
	public void setJob(Job job)
	{
		this.job=job;
	}

	public void showOff8()
	{
		System.out.println(this.name);
		if (email != null) {
			for (int i = 0; i < email.length; i++) {
				Email email2 = email[i];
				
			}
			if(emails!=null)
				
			System.out.println("running email details");
			this.email.showOff7();

		} else {
			System.out.println("not running email");
		}
		


		
		if (job != null) {
			System.out.println(" ------------");
			this.job.showOff6();

		} else {
			System.out.println("not running job");
		}
		
	}
}
