package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.examples.configuration.PencilConfiguration;
import com.xworkz.examples.things.Pencil;

public class PencilRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(PencilConfiguration.class);
		String[] beanNames=container.getBeanDefinitionNames();
		
	System.out.println(Arrays.toString(beanNames));
		
		Pencil ref=container.getBean("name",Pencil.class);	
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getType());
		System.out.println(ref.getPrice());
		System.out.println(ref.getColor());
		System.out.println(ref.getSharp());
		System.out.println(ref.getStolen());

	}

}
