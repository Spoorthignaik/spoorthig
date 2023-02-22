package com.xworkz.things.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.things")
public class ChiefMinisterConfiguration {
	
	public ChiefMinisterConfiguration() {
		System.out.println("running ChiefMinisterConfiguration ");
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("registering viewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
}
