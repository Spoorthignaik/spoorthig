package com.xworkz.examples.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import com.xworkz.examples.dto.WatchDto;
import com.xworkz.examples.entity.WatchEntity;


public interface WatchService {

	Set<ConstraintViolation<WatchDto>> validateAndSave(WatchDto dto);

	default WatchDto findById(int id) {
		return null;
	}

	default List<WatchDto> findByType(String type) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<WatchDto>> validateAndUpdate(WatchDto dto);

	default WatchDto deleteById(int id) {
		return null;
	}
	default List<WatchDto> findAll() {
		return Collections.emptyList();
	}

	default List<WatchDto> findByBrandAndType(String brand, String type) {
		return Collections.emptyList();
	}

	default List<WatchDto> findByBrand(String brand) {
		return Collections.emptyList();
	}

}
