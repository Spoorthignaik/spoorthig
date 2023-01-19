package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDto;
import com.xworkz.soldier.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;

	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		super();
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDto resortDto) {
		System.out.println("running validate and save");
		System.out.println("resortDto " + resortDto);

		Set<ConstraintViolation<ResortDto>> violations = this.validator.validate(resortDto);

		if (!violations.isEmpty()) {
			System.err.println("there are validations error");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("data is valid and save");
			boolean saved = this.resortRepo.save(resortDto);
			System.out.println("saved resortdto:" + saved);
			return saved;
		}

	}

}
