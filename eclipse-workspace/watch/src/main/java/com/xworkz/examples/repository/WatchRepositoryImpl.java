package com.xworkz.examples.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.examples.entity.WatchEntity;
import com.xworkz.examples.service.WatchServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class WatchRepositoryImpl implements WatchRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public WatchRepositoryImpl() {
		System.out.println("created WatchRepositoryImpl");
	}

	@Override
	public boolean save(WatchEntity watchEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(watchEntity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public WatchEntity findById(int id) {
		System.out.println("running find by method");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		WatchEntity fromDb = entityManager.find(WatchEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	@Override
	public List<WatchEntity> findByType(String type) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByType");
			;
			query.setParameter("typ", type);
			List<WatchEntity> list = query.getResultList();
			System.out.println("Total list fouund in repo " + list.size());
			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(WatchEntity watchEntity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(watchEntity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public WatchEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		WatchEntity delete = manager.find(WatchEntity.class, id);
		transaction.begin();
		manager.remove(delete);
		transaction.commit();
		manager.close();
		return delete;
	}

	
	
	@Override
	public List<WatchEntity> findAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findAll");
			System.out.println("Query:" + query);
			List<WatchEntity> list = query.getResultList();
			System.out.println(list);
			return list;
		} finally {
			entityManager.close();
		}

	}
	
	
	@Override
	public List<WatchEntity> findByBrandAndType(String brand, String type) {
		System.out.println("Running findByBrandAndType:"+brand+type);
		
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
		Query query=manager.createNamedQuery("findByBrandAndType");
		query.setParameter("brand", brand);
		query.setParameter("type", type);
		System.out.println("Query:"+query);
		List<WatchEntity> list=query.getResultList();
		System.out.println("List found in repo:"+list.size());
		return list;
		}finally {
			manager.close();
		}
		
	}
	
	
	@Override
	public List<WatchEntity> findByBrand(String brand) {
		System.out.println("Running Find by brand in repo:" + brand);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("brand", brand);
			List<WatchEntity> list = query.getResultList();
			System.out.println("Total list found in repo:" + list.size());

			return list;
		} finally {
			manager.close();
		}
	}
	
	
}
