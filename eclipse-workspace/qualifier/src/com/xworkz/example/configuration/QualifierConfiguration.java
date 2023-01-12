package com.xworkz.example.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.example")
public class QualifierConfiguration {
	
	public QualifierConfiguration() {
		System.out.println("created default constructor");
	}
	
	
	
	@Bean
	public int idNo() {
		System.out.println("created id no");
		return 2;
	}

	@Bean
	public String language1() {
		System.out.println("created language");
		return "hindi";
	}
	
	
	@Bean
	public String newsPaperName() {
		System.out.println("created newsPaperName");
		return "hindi";
	}
	
	@Bean
	public String ownerName1() {
		System.out.println("created ownerName1");
		return "vijayananda";
	}
	
	@Bean
	public double price1() {
		System.out.println("created price1");
		return 24.5;
	}
	
	
	
	
	
	
	@Bean
	public String snakeName() {
		System.out.println("created snakeName");
		return "cobra";
	}
	
	@Bean
	public String snakeType() {
		System.out.println("created snakeType");
		return "pythonFamily";
	}
	
	@Bean
	public boolean snakePoisen() {
		System.out.println("created snakeType");
		return true;
	}
	
		
	@Bean
	public double snakeLength() {
		System.out.println("created snake length");
		return 18.9;
	}
	
	@Bean
	public String snakeColor() {
		System.out.println("created snakeColor");
		return "red";
	}
	
	
	
	
	
	
	@Bean
	public String engineName() {
		System.out.println("created engineName");
		return "petrolEngine";
	}
	
	@Bean
	public String engineType() {
		System.out.println("created engineType");
		return "InlineEngine";
	}
	
	
	@Bean
	public String engineCompany() {
		System.out.println("created engineCompany");
		return "IBMCompany";
	}
	
	
	@Bean
	public double engineNumber() {
		System.out.println("created engineNumber");
		return 24.8;
	}
	
	

	@Bean
	public String engineVersion() {
		System.out.println("created engineVersion");
		return "YUT76467";
	}
	
	@Bean
	public int engineStrokes() {
		System.out.println("created engineStrokes");
		return 4;
	}
	
	
	
	
	
	@Bean
	public String ghostName() {
		System.out.println("created ghostName");
		return "sinchana";
	}
	
	@Bean
	public int ghostAge() {
		System.out.println("created ghost age");
		return 23;
	}
	
	@Bean
	public String ghostGender() {
		System.out.println("created ghostGender");
		return "female";
	}
	
	@Bean
	public int ghostNoOfLegs() {
		System.out.println("created ghostNoOfLegs");
		return 4;
	}
	
	
	@Bean
	public int ghostNoOfHands() {
		System.out.println("created ghostNoOfHands");
		return 4;
	}
	
	@Bean
	public String ghostColor() {
		System.out.println("created ghostColor");
		return "white";
	}
	
	@Bean
	public String ghostLocation() {
		System.out.println("created ghostLocation");
		return "shivamogga";
	}
	
	@Bean
	public double ghostHeight() {
		System.out.println("created ghostHeight");
		return 157.8;
	}
	
	@Bean
	public double ghostNailLength() {
		System.out.println("created ghostNailLength");
		return 26.7;
	}
	
	@Bean
	public String ghostReasonForDeath() {
		System.out.println("created ghostReasonForDeath");
		return "suicide";
	}
	
	@Bean
	public String ghostDressCode() {
		System.out.println("created ghostDressCode");
		return "white";
	}
	
	@Bean
	public String ghostType() {
		System.out.println("created ghostType");
		return "anabella";
	}
	
	@Bean
	public int ghostNoOfKills() {
		System.out.println("created ghostNoOfKills");
		return 5;
	}
	
	@Bean
	public LocalDate ghostDateOfBirth() {
		System.out.println("created ghostDateOfBirth");
		return LocalDate.of(2023, 04, 12);
	}
	
	@Bean
	public LocalDate ghostDateOfDeath() {
		System.out.println("created ghostDateOfDeath");
		return LocalDate.of(2022, 04, 12);
	}
	
	@Bean
	public String ghostReligion() {
		System.out.println("created ghostReligion");
		return "hindu";
	}
		
	@Bean
	public boolean ghostMarried() {
		System.out.println("created ghostMarried");
		return true;
	}
	
	@Bean
	public boolean ghostInnocent() {
		System.out.println("created ghostInnocent");
		return true;
	}
	
	@Bean
	public boolean ghostHorrible() {
		System.out.println("created ghostHorrible");
		return true;
	}
	
	@Bean
	public boolean ghostDangerous() {
		System.out.println("created ghostDangerous");
		return true;
	}
	
	
	
	
	
	
 
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

