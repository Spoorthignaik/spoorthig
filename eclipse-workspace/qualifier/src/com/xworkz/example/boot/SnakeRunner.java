package com.xworkz.example.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.example.configuration.QualifierConfiguration;
import com.xworkz.example.things.Snake;

public class SnakeRunner {

	public static void main(String[] args) {
	
		ApplicationContext container = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Snake ref = container.getBean("snakeName",Snake.class);
		System.out.println(ref);
		
		Snake ref1 = container.getBean("snakeColor",Snake.class);
		System.out.println(ref1);
		
		Snake ref2 = container.getBean("snakeType",Snake.class);
		System.out.println(ref2);
	
		
	}

}
