package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.things.Actor;
import com.xworkz.examples.things.Rocket;

public class ActorRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(Rocket.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Actor actor1=container.getBean("RakshithShetty",Actor.class);	
		System.out.println(actor1.getName());
		System.out.println(actor1.getLang());
		System.out.println(actor1.getAge());
		
		Actor actor2=container.getBean("Karthik",Actor.class);	
		System.out.println(actor2.getName());
		System.out.println(actor2.getLang());
		System.out.println(actor2.getAge());
		
		Actor actor3=container.getBean("RishabhShetty",Actor.class);	
		System.out.println(actor3.getName());
		System.out.println(actor3.getLang());
		System.out.println(actor3.getAge());
		
		

	}

}
