package com.xworkz.examples.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.examples.dto.ValentineDto;
import com.xworkz.examples.entity.ValentineEntity;
import com.xworkz.examples.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineRepository valentineRepository;

	public ValentineServiceImpl() {
		System.out.println("created ValentineServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto " + dto);
			return violations;
		} else {
			System.out.println("violations is not there in dto,can save");
			
			ValentineEntity entity=new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			
			boolean saved=this.valentineRepository.save(entity);
			System.out.println("entity data is saved in repo");
			return Collections.emptySet();
		}

	}

}
