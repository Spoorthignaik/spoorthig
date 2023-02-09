package com.xworkz.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.example.dto.BakeryDto;
import com.xworkz.example.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService{

	@Autowired
	private BakeryRepository bakeryRepository;
	
	public BakeryServiceImpl() {
	  System.out.println("created BakeryServiceImpl");
	}
	
	@Override
	public boolean validateAndSave(BakeryDto dto) {
	System.out.println("runninng validate and save in Bakery service "+dto);
	boolean saved=this.bakeryRepository.save(dto);
	System.out.println("saved in repo "+saved);
		return false;
	}

}
