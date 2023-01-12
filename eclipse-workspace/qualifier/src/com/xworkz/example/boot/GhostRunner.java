package com.xworkz.example.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.example.configuration.QualifierConfiguration;
import com.xworkz.example.things.Ghost;

public class GhostRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Ghost ref = container.getBean(Ghost.class);
		System.out.println(ref);
	
		

	}

}
