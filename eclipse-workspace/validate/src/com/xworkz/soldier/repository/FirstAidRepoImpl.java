package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDto aidDto) {
		System.out.println("running save in repo");
		System.out.println("aidDto:" + aidDto);
		return true;
	}

}
