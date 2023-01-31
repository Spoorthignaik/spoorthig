package com.xworkz.laser.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringWebInit() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses ");
		Class[] ref = { SpringBeanConfiguration.class };
		System.out.println("getServletConfigClasses: " + Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletConfigClasses ");
		String[] str = { "/" };
		System.out.println("getServletConfigClasses: " + Arrays.toString(str));
		return str;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling ");
		configurer.enable();
	}

}
