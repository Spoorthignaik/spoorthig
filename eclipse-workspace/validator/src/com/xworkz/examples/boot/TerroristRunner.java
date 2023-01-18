package com.xworkz.examples.boot;

import com.xworkz.examples.dto.TerroristDTO;
import com.xworkz.examples.service.TerroristService;
import com.xworkz.examples.service.TerroristServiceImpl;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDTO dto=new TerroristDTO();
		dto.setName("suhas");
		dto.setAge(23);
		System.out.println(dto);
		
		
		TerroristService  service=new TerroristServiceImpl();
		service.validateAndSave(dto);
		
	}

}
