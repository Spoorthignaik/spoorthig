package com.xworkz.spoo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spoo")
public class SpooConfiguration {
	
	public SpooConfiguration() {
		System.out.println("running SpooConfiguration ");
	}

}
