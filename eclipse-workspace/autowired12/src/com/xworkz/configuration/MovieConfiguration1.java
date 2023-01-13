package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Movie;
@Configuration
@ComponentScan("com.xworkz")

public class MovieConfiguration1 {
	
	@Bean
	public Movie kannadaMovie() {
		System.out.println("Registering kannada");
		Movie movie=new Movie();
		return movie;
	}

}
