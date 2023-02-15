package com.xworkz.examples.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.examples.dto.ValentineDto;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto);
}
