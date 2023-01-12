package com.xworkz.examples.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.configuration.HardwareShopConfiguratioon;
import com.xworkz.examples.things.HardWareShop;

public class HardwareRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(HardwareShopConfiguratioon.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		HardWareShop ref = container.getBean(HardWareShop.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getGstNo());
		System.out.println(ref.getId());
		System.out.println(ref.getAddress());
		System.out.println(ref.getId());

	}

}
