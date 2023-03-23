package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ComponentScan("com.xworkz.examples")
public class WatchConfiguration {
	
	public WatchConfiguration() {
		System.out.println("created WatchConfiguration");
	}
	
	@Bean
	public MultipartResolver multiPartResolver() {
	System.out.println("registering multiPartResolver");
	return new StandardServletMultipartResolver();
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
