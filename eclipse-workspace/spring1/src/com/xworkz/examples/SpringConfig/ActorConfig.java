package com.xworkz.examples.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.examples.things.Actor;
import com.xworkz.examples.things.Rocket;

@ComponentScan
@Configuration

public class ActorConfig {
	
	
	public ActorConfig() {
		System.out.println("running default constructor");
	}
	
	@Bean
	public Actor HritvikRoshan() {
		System.out.println("registering the HritvikRoshan  in spring");
		Actor actor=new Actor("hritvik","hindi",23);
		return actor;
	}
	
	
	@Bean
	public Actor VarunDhavan() {
		System.out.println("registering the VarunDhavan in spring");
		Actor actor1=new Actor("varun","hindi",30);
		return actor1;
	}
	
	@Bean
	public Actor Karthik() {
		System.out.println("registering the Karthik in spring");
		Actor actor2=new Actor("karthik","hindi",32);
		return actor2;
	}
	
	@Bean
	public Actor RakshithShetty() {
		System.out.println("registering the RakshithShetty in spring");
		Actor actor3=new Actor("rakshith","kannada",28);
		return actor3;
	}
	
	
	@Bean
	public Actor RishabShetty() {
		System.out.println("registering the RishabShetty in spring");
		Actor actor4=new Actor("rishabh","kannada",33);
		return actor4;
	}
	

}
