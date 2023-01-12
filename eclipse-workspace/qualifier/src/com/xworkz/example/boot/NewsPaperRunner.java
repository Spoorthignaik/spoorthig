package com.xworkz.example.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.example.configuration.QualifierConfiguration;
import com.xworkz.example.things.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		NewsPaper ref1= container.getBean("newsPaperName",NewsPaper.class);
		System.out.println(ref1);
	
		NewsPaper ref2= container.getBean("ownerName1",NewsPaper.class);
		System.out.println(ref2);
	
		
		NewsPaper ref3 = container.getBean(,NewsPaper.class);
		System.out.println(ref3);
	
		

	}

}
