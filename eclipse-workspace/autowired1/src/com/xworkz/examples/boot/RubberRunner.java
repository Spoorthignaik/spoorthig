package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.examples.configuration.RubberConfiguration;
import com.xworkz.examples.things.Rubber;


public class RubberRunner {

	public static void main(String[] args) {
	
		
		ApplicationContext container=new AnnotationConfigApplicationContext(RubberConfiguration.class);
		String[] beanNames=container.getBeanDefinitionNames();
		
	System.out.println(Arrays.toString(beanNames));
		
		Rubber ref=container.getBean("name",Rubber.class);	
		
		System.out.println(ref.getName());
		System.out.println(ref.getType());
		System.out.println(ref.getPrice());
		System.out.println(ref.getColor());
		System.out.println(ref.isStolen());
		System.out.println(ref.getSize());
		System.out.println(ref.getShape());


	}

}
