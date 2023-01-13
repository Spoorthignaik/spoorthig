package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.MovieConfiguration1;
import com.xworkz.things.Movie;

public class MoviesRunner {
	
	public static void main(String[] args)
	{
		ApplicationContext container=new AnnotationConfigApplicationContext(MovieConfiguration1.class);
		
		String[] beanNames=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Movie movie= container.getBean("movie",Movie.class) ;
		System.out.println(movie);	
		
		Movie movie2=container.getBean("kannadaMovie", Movie.class);
		System.out.println(movie2);
	}

}
