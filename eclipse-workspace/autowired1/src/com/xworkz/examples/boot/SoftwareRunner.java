package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.configuration.HardwareShopConfiguratioon;
import com.xworkz.examples.configuration.SoftwareConfiguration;
import com.xworkz.examples.things.HardWareShop;
import com.xworkz.examples.things.Software;

public class SoftwareRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Software ref = container.getBean(Software.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getVersion());
		System.out.println(ref.getDate());
		System.out.println(ref.isDeveloper());
		System.out.println(ref.isFree());
	}

}
