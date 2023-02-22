package com.xworkz.things.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.things.dto.ChiefMinisterDto;

public interface ChiefMinisterService {

	Set<ConstraintViolation<ChiefMinisterDto>> validateAndSave(ChiefMinisterDto chiefMinisterDto);

}
