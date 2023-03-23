package com.xworkz.examples.repository;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.examples.entity.WatchEntity;

public interface WatchRepository {
	
   boolean save(WatchEntity watchEntity);
   
   boolean update(WatchEntity watchEntity);
   
   
	
	 default WatchEntity findById(int id)
	 {
		 return null;
	 }

	 default List<WatchEntity>findByType(String type){
		 return Collections.emptyList();
	 }
	 
	 default WatchEntity deleteById(int id) {
			return null;
		}
	 default List<WatchEntity> findAll() {
			return Collections.emptyList();
		}
	 
	 default List<WatchEntity> findByBrand(String name) {
			return Collections.emptyList();
		}
	 
	 default List<WatchEntity> findByBrandAndType(String brand,String type) {
			return Collections.emptyList();
		}
}
