package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.examples.configuration.SchoolConfiguration;
import com.xworkz.examples.things.School;

public class SchoolRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SchoolConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		School ref = container.getBean(School.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getType());
		System.out.println(ref.getLanguage());
		System.out.println(ref.getLocation());
		System.out.println(ref.getNoOfStaffs());
		System.out.println(ref.getNoOfStudeents());
		System.out.println(ref.getContactNo());
		System.out.println(ref.isGood());
		System.out.println(ref.isPrimary());
	}

}
