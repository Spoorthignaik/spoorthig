package com.xworkz.examples;

public abstract class Person {
	
	public int age;
	public String name;
	public boolean white;
	public double height;
	public String jobLocation;
	
	
	public void eat() {
		System.out.println("running eat method");
		
	}
	
	public void sleep() {
		System.out.println("running sleep method");	
	}
	
	public abstract void trainer();
	
	
    public static void main(String[] args) {
	 
 }
}
