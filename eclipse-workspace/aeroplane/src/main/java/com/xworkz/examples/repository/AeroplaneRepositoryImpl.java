package com.xworkz.examples.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.examples.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroplaneRepositoryImpl() {
		System.out.println("created AeroplaneRepositoryImpl");
	}
	@Override
	public boolean save(AeroplaneEntity aeroplaneEntity) {
		 EntityManager em=this.entityManagerFactory.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 et.begin();
		 em.persist(aeroplaneEntity);
		 et.commit();
		 em.close();
		return true;
	}
	
	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("running find by method");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDb=entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	

}
