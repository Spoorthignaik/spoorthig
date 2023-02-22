package com.xworkz.examples.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.examples.dto.AeroplaneDto;
import com.xworkz.examples.entity.AeroplaneEntity;
import com.xworkz.examples.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImpl implements AeroplaneService{

	@Autowired
	private AeroplaneRepository aeroplaneRepository;
	
	
	public AeroplaneServiceImpl() {
		System.out.println("created AeroplaneServiceImpl");
	}
	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto) {
	
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<AeroplaneDto>>violations=validator.validate(dto);

		if(violations!=null && !violations.isEmpty()) {
			System.out.println("violations in dto "+dto);
			return violations;
		}else {
			System.out.println("violation is not there in dto can save ");
		}
		
		AeroplaneEntity entity= new AeroplaneEntity();
		entity.setCompany(dto.getCompany());
		entity.setName(dto.getName());
		entity.setCost(dto.getCost());
		entity.setType(dto.getType());
		entity.setCountry(dto.getCountry());
		
		boolean saved=this.aeroplaneRepository.save(entity);
		System.out.println("entity data is saved in repo");
		return Collections.emptySet();
	}

	@Override
	public AeroplaneDto findById(int id) {
		if(id>0) {
			AeroplaneEntity entity=this.aeroplaneRepository.findById(id);
			if(entity!=null) {
				System.out.println("entity is found in service for id "+id);
				AeroplaneDto dto=new AeroplaneDto();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
	}
	
	
}
