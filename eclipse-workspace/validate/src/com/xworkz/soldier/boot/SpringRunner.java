package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.SpringConfiguration;
import com.xworkz.soldier.dto.FirstAidDto;
import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.dto.ResortDto;
import com.xworkz.soldier.service.FirstAidService;
import com.xworkz.soldier.service.MissileService;
import com.xworkz.soldier.service.ResortService;

public class SpringRunner {

	
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidService service=container.getBean(FirstAidService.class);
		
		boolean saved=service.validateAndSave(new FirstAidDto());
		System.out.println("saved:"+saved);
		
		System.out.println("========================================================");
		
		MissileService service1=container.getBean(MissileService.class);
		
		boolean saved1=service1.validateAndSave(new MissileDto());
		System.out.println("saved:"+saved1);
		
		System.out.println("========================================================");
		
		
		ResortService service2=container.getBean(ResortService.class);
		
		boolean saved2=service2.validateAndSave(new ResortDto());
		System.out.println("saved:"+saved2);
		
	}
}








