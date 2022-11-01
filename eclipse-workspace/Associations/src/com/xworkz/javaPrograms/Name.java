package com.xworkz.javaPrograms;

public class Name {
	

		
		public String pastName;
		public String presentName;
		public String futureName;
		
		
		
		public Name(String pastName,String presentName,String futureName)
		{
			this.pastName= pastName;
			this.presentName= presentName;
			this.futureName= futureName;
		}
		
		
		public void display() {
			System.out.println(pastName);
			System.out.println(presentName);
			System.out.println(futureName);

		}

	}
