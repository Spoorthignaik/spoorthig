package com.xworkz.examples.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.examples.dto.EggDto;

@Repository
public class EggRepositoryImpl implements EggRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public EggRepositoryImpl() {
		System.out.println("running EggRepositoryImpl");
	}
	
	@Override
	public boolean save(EggDto eggDto) {
		System.out.println("running save in egg repo"+eggDto);
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(eggDto);
		entityTransaction.commit();
		entityManager.close();
		
		return false;
	}

}
