package com.xworkz.examples.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.examples.dto.WatchDto;
import com.xworkz.examples.entity.WatchEntity;
import com.xworkz.examples.repository.WatchRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WatchServiceImpl implements WatchService {

	@Autowired
	private WatchRepository watchRepository;

	public WatchServiceImpl() {
		System.out.println("created WatchServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<WatchDto>> validateAndSave(WatchDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<WatchDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations in dto " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto can save ");
		}

		WatchEntity entity = new WatchEntity();
		entity.setBrand(dto.getBrand());
		entity.setColor(dto.getColor());
		entity.setPrice(dto.getPrice());
		entity.setType(dto.getType());
		entity.setWarranty(dto.getWarranty());

		boolean saved = this.watchRepository.save(entity);
		System.out.println("entity data is saved in repo");
		return Collections.emptySet();
	}

	@Override
	public WatchDto findById(int id) {
		if (id > 0) {
			WatchEntity entity = this.watchRepository.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id " + id);
				WatchDto dto = new WatchDto();
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				dto.setWarranty(entity.getWarranty());
				dto.setBrand(entity.getBrand());
				dto.setColor(entity.getColor());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return WatchService.super.findById(id);
	}

	@Override
	public List<WatchDto> findByType(String type) {
		System.out.println("running findByType in service" + type);

		if (type != null && !type.isEmpty()) {
			System.out.println("company is valid ...Calling repo");
			List<WatchEntity> entities = this.watchRepository.findByType(type);

			List<WatchDto> listOfDto = new ArrayList<WatchDto>();

			for (WatchEntity entity : entities) {
				WatchDto dto = new WatchDto();
				dto.setBrand(entity.getBrand());
				dto.setColor(entity.getColor());
				dto.setType(entity.getType());
				dto.setPrice(entity.getPrice());
				dto.setWarranty(entity.getWarranty());
				dto.setId(entity.getId());
				listOfDto.add(dto);
			}

			System.out.println("size of dtos " + listOfDto.size());
			System.out.println("size  of entities " + entities.size());
			return listOfDto;

		} else {
			System.err.println("company is invalid");
		}

		return WatchService.super.findByType(type);
	}

	@Override
	public Set<ConstraintViolation<WatchDto>> validateAndUpdate(WatchDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<WatchDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations in dto " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto can save ");
		}

		WatchEntity entity = new WatchEntity();
		entity.setBrand(dto.getBrand());
		entity.setColor(dto.getColor());
		entity.setPrice(dto.getPrice());
		entity.setType(dto.getType());
		entity.setWarranty(dto.getWarranty());
		entity.setId(dto.getId());

		boolean saved = this.watchRepository.update(entity);
		System.out.println("entity data is saved in " + saved);
		return Collections.emptySet();
	}

	@Override
	public WatchDto deleteById(int id) {
		System.out.println("Runnig delete by id in service:" + id);
		if (id > 0) {
			WatchEntity entity = this.watchRepository.deleteById(id);

			/*
			 * if(entity!=null) { FruitsDto dto=new FruitsDto(); dto.setId(entity.getId());
			 * dto.setName(entity.getName()); dto.setSelectFruits(entity.getSelectFruits());
			 * dto.setQuantity(entity.getQuantity()); dto.setLocation(entity.getLocation());
			 * dto.setMobileNumber(entity.getMobileNumber()); return dto;
			 */
		}
		return WatchService.super.deleteById(id);
	}

	@Override
	public List<WatchDto> findAll() {
		System.out.println("Running FindAll in service");
		List<WatchEntity> entities = this.watchRepository.findAll();

		List<WatchDto> listDto = new ArrayList<WatchDto>();
		for (WatchEntity fruitsEntity : entities) {
			WatchDto dto = new WatchDto();
			BeanUtils.copyProperties(fruitsEntity, dto);

			listDto.add(dto);
		}

		return listDto;
	}

	@Override
	public List<WatchDto> findByBrandAndType(String brand, String type) {
		System.out.println("Running findByNameAndLocation in service: " + brand + type);
		if ((brand != null && !brand.isEmpty()) || (type != null && !type.isEmpty())) {
			List<WatchEntity> entities = this.watchRepository.findByBrandAndType(brand, type);

			List<WatchDto> listDtos = new ArrayList<WatchDto>();
			for (WatchEntity watchEntity : entities) {
				WatchDto dto = new WatchDto();
				BeanUtils.copyProperties(watchEntity, dto);
				listDtos.add(dto);
				System.out.println("Size of dtos:" + listDtos.size());
				System.out.println("Size of entitys:" + entities.size());
				return listDtos;
			}
		} else {
			System.out.println("Name ANd LOcation in invalid:" + brand + type);
		}
		return WatchService.super.findByBrandAndType(brand, type);

	}

	@Override
	public List<WatchDto> findByBrand(String brand) {
		System.out.println("Running findByBrand in service:" + brand);

		if (brand != null && !brand.isEmpty()) {
			List<WatchEntity> entity = this.watchRepository.findByBrand(brand);

			List<WatchDto> listDto = new ArrayList<WatchDto>();

			for (WatchEntity watchEntity : entity) {

				WatchDto dto = new WatchDto();
				BeanUtils.copyProperties(watchEntity, dto);
				/*
				 * dto.setId(fruitsEntity.getId()); dto.setName(fruitsEntity.getName());
				 * dto.setSelectFruits(fruitsEntity.getSelectFruits());
				 * dto.setQuantity(fruitsEntity.getQuantity());
				 * dto.setLocation(fruitsEntity.getLocation());
				 * dto.setMobileNumber(fruitsEntity.getMobileNumber());
				 */
				listDto.add(dto);

				System.out.println("Size of dtos:" + listDto.size());
				System.out.println("Size of entitys:" + entity.size());
				return listDto;

			}
		} else {
			System.out.println("Invalid name");
		}
		return WatchService.super.findByBrand(brand);
	}

}
