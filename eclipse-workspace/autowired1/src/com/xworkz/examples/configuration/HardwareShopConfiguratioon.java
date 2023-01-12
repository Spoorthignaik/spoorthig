package com.xworkz.examples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("com.xworkz.examples")
public class HardwareShopConfiguratioon {
	
	public HardwareShopConfiguratioon() {
		System.out.println("running hardware shop configuration");
	}
		
	@Bean
	public int id() {
		System.out.println("registering id ");
		return 22;
			
	}
	
	
	@Bean
	public int idNo() {
		System.out.println("registering id no");
		return 25;
			
	}
	
	@Bean
	public String name() {
		System.out.println("registering the name of the hardware shop");
		return "adishakthi";
	}
	
	@Bean
	public String gstNo() {
		System.out.println("registering the gst no of the hardware shop");
		return "344343NS";
	}
	
	@Bean
	public String ownerName() {
		System.out.println("registering the owner name  of the hardware shop");
		return "Vishal";
	}
	
	@Bean
	public String address() {
		System.out.println("registering the address of the hardware shop");
		return "hatiNagar";
	}
	
	
	
	
	

}
