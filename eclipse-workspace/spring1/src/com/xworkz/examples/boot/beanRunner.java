package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.SpringConfig.InstitutionConfiguration;

public class beanRunner {
	
	
	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(InstitutionConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		ArrayList<Integer> string = spring.getBean("arrayListValues", ArrayList.class);
		System.out.println(string.toString());

		Map<String, Integer> strings = spring.getBean("mapCityAndPincodes", Map.class);
		System.out.println(strings.toString());
	}

}
