package com.xworkz.example.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.example.configuration.QualifierConfiguration;
import com.xworkz.example.things.Engine;

public class EngineRunner {

	public static void main(String[] args) {
	
		
		ApplicationContext container = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Engine ref = container.getBean(Engine.class);
		System.out.println(ref);
		
		Engine ref1 = container.getBean(Engine.class);
		System.out.println(ref1);
		
		Engine ref2 = container.getBean(Engine.class);
		System.out.println(ref2);
	
		

	}

}
