package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.examples")

public class RubberConfiguration {
	
	public RubberConfiguration() {
		System.out.println("running RubberConfiguration");
	}

	@Bean
	public String name() {
		System.out.println("registering the name of the rubber");
		return "apsara";
	}
	
	@Bean
	public String type() {
		System.out.println("registering the type of the rubber");
		return "elastic";
	}
	
	@Bean
	public double price() {
		System.out.println("registering the price of the rubber");
		return 12.5;
	}
	
	
	@Bean
	public String color() {
		System.out.println("registering the color of the rubber");
		return "green";
	}
	
	
	@Bean
	public String shape() {
		System.out.println("registering the shape of the rubber");
		return "round";
	}
	
	@Bean
	public boolean stolen() {
		System.out.println("registering the color of the rubber");
		return true;
	}
	
	@Bean
	public String size () {
		System.out.println("registering the size of the rubber");
		return "small";
	}
	
	
	
	
}
