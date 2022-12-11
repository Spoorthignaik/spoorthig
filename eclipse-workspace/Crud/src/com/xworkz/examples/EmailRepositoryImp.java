package com.xworkz.examples;

public class EmailRepositoryImp implements  EmailRepository {
	
	private String[] emails=new String[10];
	private int emailIndex=0;
	
	

	@Override
	public boolean create(String email) {
		System.out.println("running create in email repository");
		if(this.emailIndex>=this.emails.length) {
			throw new EmailSizeExceededException();
		}
		this.emails[emailIndex]=email;
		this.emailIndex++;
		return false;
	}
	
	
	public int total() {
		return this.emails.length;
	}
	


}
