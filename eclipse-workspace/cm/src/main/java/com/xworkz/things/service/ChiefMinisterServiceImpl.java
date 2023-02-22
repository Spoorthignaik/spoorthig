package com.xworkz.things.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.things.dto.ChiefMinisterDto;
import com.xworkz.things.repository.ChiefMinisterRepository;

@Service
public class ChiefMinisterServiceImpl implements ChiefMinisterService {

	
	
	public ChiefMinisterServiceImpl() {
		System.out.println("created ChiefMinisterServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<ChiefMinisterDto>> validateAndSave(ChiefMinisterDto chiefMinisterDto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ChiefMinisterDto>> constraintViolations = validator.validate(chiefMinisterDto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exists, data is good");
			return Collections.emptySet();
		}

	}

}
