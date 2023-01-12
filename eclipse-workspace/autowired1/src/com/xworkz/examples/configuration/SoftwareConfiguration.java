package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("com.xworkz.examples")
public class SoftwareConfiguration {
	
	public SoftwareConfiguration() {
		System.out.println(" running SoftwareConfiguration");
	}
	

	
	@Bean
	public String name() {
		System.out.println("registering the name of the  software");
		return "virtusa";
	}
	
	@Bean
	public int version() {
		System.out.println("registering the version the software ");
		return 42;
	}
	
	@Bean
	public boolean developer() {
		System.out.println("registering the developer of the software");
		return true;
	}
	
	
	
	@Bean
	public int date() {
		System.out.println("registering the version the software ");
		return 29;
	}
	
	
	@Bean
	public boolean free() {
		System.out.println("registering the free of the software");
		return true;
	}
	
	
	
	
	
	
	
	

	
	
	
}
