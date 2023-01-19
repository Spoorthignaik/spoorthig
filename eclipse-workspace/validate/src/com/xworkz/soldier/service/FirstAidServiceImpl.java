package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDto;
import com.xworkz.soldier.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		super();
		this.firstAidRepo = firstAidRepo;
		System.out.println("created service by passing repo  from spring");
	}

	@Override
	public boolean validateAndSave(FirstAidDto aidDto) {
		System.out.println("running validate and save");
		System.out.println("aidDto " + aidDto);

		Set<ConstraintViolation<FirstAidDto>> violations = this.validator.validate(aidDto);

		if (!violations.isEmpty()) {
			System.err.println("there are validations error");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("data is valid and save");
			boolean saved = this.firstAidRepo.save(aidDto);
			System.out.println("saved first aid" + saved);
			return saved;
		}

	}

}
