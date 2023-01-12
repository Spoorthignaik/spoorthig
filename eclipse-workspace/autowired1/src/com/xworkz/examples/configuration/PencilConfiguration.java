package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("com.xworkz.examples")
public class PencilConfiguration {

	public PencilConfiguration() {
		System.out.println("running PencilConfiguration");
	}

	@Bean
	public String name() {
		System.out.println("registering the name of the pencil");
		return "nataraj";
	}

	@Bean
	public String type() {
		System.out.println("registering the type of the pencil");
		return "shining";
	}

	@Bean
	public Double price() {
		System.out.println("registering the price of the pencil");
		return 10.5;
	}

	@Bean
	public String color() {
		System.out.println("registering the color of the pencil");
		return "red";
	}

	@Bean
	public Boolean stolen() {
		System.out.println("registering the stolen of the pencil");
		return true;
	}

}
