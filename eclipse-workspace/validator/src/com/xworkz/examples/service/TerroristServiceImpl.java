package com.xworkz.examples.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.examples.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService{
	
	public TerroristServiceImpl() {
		System.out.println("Created terrorist serive imp using no-arg const");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("dto passes:"+dto);
		
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("Error is there");
			violations.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		
		System.out.println("no validation errors");
		return true;
	}
	
	
	
	

}
