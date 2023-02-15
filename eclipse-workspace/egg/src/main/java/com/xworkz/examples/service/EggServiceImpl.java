package com.xworkz.examples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.examples.dto.EggDto;
import com.xworkz.examples.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService{

	
	@Autowired
	private EggRepository eggRepository;
	
	
	public EggServiceImpl() {
		System.out.println("running EggServiceImpl");
	}
	
	
	@Override
	public boolean validateAndSave(EggDto dto) {
	System.out.println("runninng validate and save in egg service "+dto);
	boolean saved=this.eggRepository.save(dto);
	System.out.println("saved in repo "+saved);
		return false;
	}
	
	

}
