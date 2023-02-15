package com.xworkz.examples.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.examples.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepositoryImpl() {
		System.out.println("running ValentineRepositoryImpl");
	}
	
	
	@Override
	public boolean save(ValentineEntity valentineEntity) {
		System.out.println("running save in repository");
		EntityManager em=this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(valentineEntity);
		et.commit();
		em.close();
		return true;
	}
	
	

}
