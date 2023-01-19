package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepo;
import com.xworkz.soldier.repository.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierService;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {
	
	public static void main(String[] args) {
		
		SoldierDto dto=new SoldierDto("ma", 2, "lowRated", "cavalry", "india");
		
		SoldierServiceImpl service=new SoldierServiceImpl();
		
		SoldierRepo repo=new SoldierRepoImpl();
        service.setSoldierRepo(repo);
		service.validateAndSave(dto);
		
		
	}

}
