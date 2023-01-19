package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDto;
import com.xworkz.soldier.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	
	
	
    @Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		super();
		this.missileRepo = missileRepo;
	}




	@Override
	public boolean validateAndSave(MissileDto missileDto) {
		System.out.println("running validate and save");
		System.out.println("missileDto:" + missileDto);

		Set<ConstraintViolation<MissileDto>> violations = this.validator.validate(missileDto);

		if (!violations.isEmpty()) {
			System.out.println("there are validation error");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("data is valid and we can save");
			boolean saved = this.missileRepo.save(missileDto);
			System.out.println("saved missile dto:" + saved);
			return saved;
		}

	}

}
