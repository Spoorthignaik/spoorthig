package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.things.Rocket;
import com.xworkz.examples.things.Season;

public class SeasonRunner {

	public static void main(String[] args) {

		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(Rocket.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Season season1=container.getBean("summer1",Season.class);	
		System.out.println(season1.getDuration());
		System.out.println(season1.getName());
		System.out.println(season1.getStartingMonth());
		
		Season season2=container.getBean("mansoon",Season.class);	
		System.out.println(season2.getDuration());
		System.out.println(season2.getName());
		System.out.println(season2.getStartingMonth());
		
		
		Season season3=container.getBean("rainy",Season.class);	
		System.out.println(season3.getDuration());
		System.out.println(season3.getName());
		System.out.println(season3.getStartingMonth());
		
		
		
		
		
		
	}

}
