package com.xworkz.examples.boot;

import com.xworkz.examples.*;

public class PersonRunner extends Person {
	
	
	void display() {
		super.eat();
		super.sleep();
	}

	public static void main(String[] args) {
		
		JavaTrainee trainee=new JavaTrainee();
		trainee.age=21;
		trainee.height=5.3;
		trainee.name="Spoorthi";
		trainee.white=true;
		trainee.jobLocation="bangalore";
		trainee.hashCode();
		
		
		
	}

	@Override
	public void trainer() {
		// TODO Auto-generated method stub
		
	}

}
