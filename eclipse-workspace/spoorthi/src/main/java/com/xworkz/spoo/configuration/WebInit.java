package com.xworkz.spoo.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebInit  extends AbstractAnnotationConfigDispatcherServletInitializer implements  WebMvcConfigurer{

	public WebInit() {
		System.out.println("WebInit");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	System.out.println("running getServletConfigClasses");
		return new Class[] {SpooConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("running configureDefaultServletHandling ");
	configurer.enable();
	}

}
