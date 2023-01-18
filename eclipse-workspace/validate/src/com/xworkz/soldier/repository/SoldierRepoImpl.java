package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDto;

public class SoldierRepoImpl implements SoldierRepo {

	public SoldierRepoImpl() {
		System.out.println("created SoldierRepoImpl using no arg-constr...");
	}

	public boolean save(SoldierDto dto) {
		System.out.println("running save");
		System.out.println("dto=" + dto);

		return false;
	}

}
