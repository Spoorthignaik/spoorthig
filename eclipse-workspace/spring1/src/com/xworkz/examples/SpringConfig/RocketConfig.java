package com.xworkz.examples.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.examples.things.Rocket;

@ComponentScan
@Configuration("com.xworkz")

public class RocketConfig {
	
	public RocketConfig() {
		System.out.println("running default constructor");
	}
	
	@Bean
	public Rocket missionMangal() {
		System.out.println("registering the rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	
	@Bean
	public Rocket scout() {
		System.out.println("registering the rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	@Bean
	public Rocket falconHeavy() {
		System.out.println("registering the rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	@Bean
	public Rocket atlas() {
		System.out.println("registering the rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	
	@Bean
	public Rocket saturn() {
		System.out.println("registering the rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	
	
	
	

}
