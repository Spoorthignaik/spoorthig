package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.examples")
public class SchoolConfiguration {

	public SchoolConfiguration() {
		System.out.println("running default constructor");
	}

	@Bean
	public String name() {
		System.out.println("running name of the school");
		return "SRVK";
	}

	@Bean
	public String type() {
		System.out.println("running type of the school");
		return "private";
	}

	@Bean
	public String location() {
		System.out.println("running location of the school");
		return "gopala";
	}

	@Bean
	public String language() {
		System.out.println("running language of the school");
		return "kannada";
	}

	@Bean
	public int noOfStudents() {
		System.out.println("running noOfStudents of the school");
		return 160;
	}

	@Bean
	public int noOfStaffs() {
		System.out.println("running noOfStaffs of the school");
		return 17;
	}

	@Bean
	public boolean primary() {
		System.out.println("running primary of the school");
		return true;
	}

	@Bean
	public boolean good() {
		System.out.println("running good of the school");
		return true;
	}

}
