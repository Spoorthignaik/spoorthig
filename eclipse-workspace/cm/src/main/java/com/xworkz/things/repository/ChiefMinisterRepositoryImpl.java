package com.xworkz.things.repository;


import org.springframework.stereotype.Repository;

import com.xworkz.things.dto.ChiefMinisterDto;

@Repository
public class ChiefMinisterRepositoryImpl implements ChiefMinisterRepository {


	
	public ChiefMinisterRepositoryImpl() {
		System.out.println("created ChiefMinisterRepositoryImpl");
	}
	@Override
	public boolean save(ChiefMinisterDto dto) {
		System.out.println("running save in cm repo"+dto);
		
		
		return false;
	}

}
