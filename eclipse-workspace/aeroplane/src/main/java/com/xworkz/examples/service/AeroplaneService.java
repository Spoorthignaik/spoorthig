package com.xworkz.examples.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.examples.dto.AeroplaneDto;
import com.xworkz.examples.dto.ValentineDto;

public interface AeroplaneService {
	
	Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto);
	
	default AeroplaneDto findById(int id) {
		return null;
	}

}
