package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.things.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(Rocket.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Rocket rocket1=container.getBean("missionMangal",Rocket.class);	
		System.out.println(rocket1.getBudget());
		System.out.println(rocket1.getCountry());
		System.out.println(rocket1.getName());
		
		Rocket rocket2=container.getBean("scout",Rocket.class);	
		System.out.println(rocket2.getBudget());
		System.out.println(rocket2.getCountry());
		System.out.println(rocket2.getName());
		
		Rocket rocket3=container.getBean("atlas",Rocket.class);	
		System.out.println(rocket3.getBudget());
		System.out.println(rocket3.getCountry());
		System.out.println(rocket3.getName());
		
		
		
		
		

	}

}
