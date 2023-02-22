package com.xworkz.examples.repository;

import com.xworkz.examples.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save(AeroplaneEntity aeroplaneEntity);
	
	AeroplaneEntity findById(int id);
}
