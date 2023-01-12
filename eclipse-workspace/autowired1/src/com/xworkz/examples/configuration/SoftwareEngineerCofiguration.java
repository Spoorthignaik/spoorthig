package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.examples")
@Configuration
public class SoftwareEngineerCofiguration {

	
	
	public SoftwareEngineerCofiguration() {
		System.out.println("runnig default constructor");
	}
	
	@Bean
	public String name() {
		System.out.println("registering the name of the software");
		return "spoorthi";
	}
	
	@Bean
	public double salary() {
		System.out.println("registering the salay of the software");
		return 56578;
	}
	
	
	@Bean
	public String companyName() {
		System.out.println("registering the companyname of the software");
		return "wipro";
	}
	
	@Bean
	public double exp() {
		System.out.println("registering the name of the software");
		return 3.5;
	}
	
	
}
