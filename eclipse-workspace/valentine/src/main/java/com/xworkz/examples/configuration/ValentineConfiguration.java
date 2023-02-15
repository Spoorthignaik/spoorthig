package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.examples")
public class ValentineConfiguration {

	public ValentineConfiguration() {
		System.out.println("created ValentineConfiguration");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("running viewResolver ");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
