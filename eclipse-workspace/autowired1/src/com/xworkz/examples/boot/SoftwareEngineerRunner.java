package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.configuration.SoftwareEngineerCofiguration;
import com.xworkz.examples.things.SoftwareEngineer;

public class SoftwareEngineerRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SoftwareEngineerCofiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		SoftwareEngineer ref = container.getBean(SoftwareEngineer.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getCompanyName());
		System.out.println(ref.getSalary());
		System.out.println(ref.getExpirience());
		
	}

}
