package com.xworkz.examples.SpringConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.examples.things.Season;

@ComponentScan
@Configuration

public class SeasonConfig {
	
	   public SeasonConfig() {
		System.out.println("running default constructor");
	}
	   
	   
	   @Bean
	   public Season summer() {
		   System.out.println("registering the summer using spring");
		   Season season=new Season();
		   return season;
	   }

	   
	   @Bean
	   public Season Rainy() {
		   System.out.println("registering the rainy using spring");
		   Season season1=new Season();
		   return season1;
	   }

	   
	   
	   @Bean
	   public Season mansoon() {
		   System.out.println("registering the mansoon using spring");
		   Season season2=new Season();
		   return season2;
	   }

	   
	   
	   @Bean
	   public Season season1() {
		   System.out.println("registering the summer using spring");
		   Season season3=new Season();
		   return season3;
	   }

	   
	   @Bean
	   public Season season2() {
		   System.out.println("registering the summer using spring");
		   Season season4=new Season();
		   return season4;
	   }

	   
	   
}
