package com.xworkz.example.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.example.dto.BakeryDto;


@Repository
public class BakeryRepositoryImpl  implements BakeryRepository{

	
	public BakeryRepositoryImpl() {
		System.out.println(" created BakeryRepositoryImpl");
	}
	
	
	@Override
	public boolean save(BakeryDto bakeryDto) {
		System.out.println("running save in bakery repository");
		return false;
	}

}
