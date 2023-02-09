package com.xworkz.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.example")
public class BakeryConfiguration {
	
	public BakeryConfiguration() {
		System.out.println("created BakeryConfiguration");
	}

}
