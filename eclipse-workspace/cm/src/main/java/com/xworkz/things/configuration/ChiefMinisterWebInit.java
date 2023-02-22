package com.xworkz.things.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ChiefMinisterWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public ChiefMinisterWebInit() {
		System.out.println("created ChiefMinisterWebInit");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return new Class[] {ChiefMinisterConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}

}
