package com.xworkz.examples.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.examples")
public class BeachConfiguration {
	
	public BeachConfiguration() {
		System.out.println("created BeachConfiguration ");
	}

}
