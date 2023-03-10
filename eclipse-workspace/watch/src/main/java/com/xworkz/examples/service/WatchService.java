package com.xworkz.examples.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import com.xworkz.examples.dto.WatchDto;

public interface WatchService {

   Set<ConstraintViolation<WatchDto>> validateAndSave(WatchDto dto);
	
	default WatchDto findById(int id) {
		return null;
	}
	
	
	default List<WatchDto>findByType(String type) {
		return Collections.emptyList();
	}
	
	Set<ConstraintViolation<WatchDto>> validateAndUpdate(WatchDto dto);
	
	boolean deleteById(int id) ;
	
}
