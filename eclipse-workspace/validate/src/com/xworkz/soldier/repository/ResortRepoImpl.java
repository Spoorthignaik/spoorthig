package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDto resortDto) {
		System.out.println("running save in repo");
		System.out.println("resortDto:" + resortDto);
		return true;
	}

}
