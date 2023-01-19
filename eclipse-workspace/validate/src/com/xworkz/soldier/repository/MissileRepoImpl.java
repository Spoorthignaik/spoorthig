package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo{

	@Override
	public boolean save(MissileDto missileDto) {
		System.out.println("running save in repo");
		System.out.println("missileDto:"+missileDto);
		return true;
	}
	
	

}
