package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.examples")
public class EggConfiguration {

	public EggConfiguration() {
		System.out.println("created EggConfiguration ");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("registering viewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("regisering localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
}
