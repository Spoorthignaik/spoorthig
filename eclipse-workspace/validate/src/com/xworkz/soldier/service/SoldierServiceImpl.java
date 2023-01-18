package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("created SoldierServiceImpl byusing no arg constructor ");
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDto dto) {
		System.out.println("executing valid and save");
		System.out.println("dto passed=" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> {
				System.out.println("violating message=" + v.getMessage());
			});
			return false;
		} 
		else 
		{
			System.out.println("data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("dto saved using repo=" + saved);
			return saved;
		}

	}

}
