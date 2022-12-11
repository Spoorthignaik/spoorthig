package com.xworkz.examples.boot;

import com.xworkz.examples.EmailRepository;
import com.xworkz.examples.EmailRepositoryImp;

public class EmailRepositoryRunner {

	public static void main(String[] args) {
		
		EmailRepository email=new EmailRepositoryImp();
		
		
		email.create("spoorthig@gmail.com");
		email.create("arun@gmail.com");
		email.create("jeevika@gmail.com");
		email.create("sinchanag@gmail.com");
		email.create("vishal@gmail.com");
		email.create("varun@gmail.com");
		email.create("pavitra@gmail.com");
		email.create("sahan@gmail.com");
		email.create("harshini@gmail.com");
		email.create("shwetha@gmail.com");
		
	 System.out.println(email.total());
		
		

	}

}
