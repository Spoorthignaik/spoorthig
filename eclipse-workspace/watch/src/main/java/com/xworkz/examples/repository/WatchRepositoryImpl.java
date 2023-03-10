package com.xworkz.examples.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.examples.entity.WatchEntity;

@Repository
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
	public boolean deleteById(int id) {
		System.out.println("running deleteById in repo.............");

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		WatchEntity watchEntity = manager.find(WatchEntity.class, id);

		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(watchEntity);
			transaction.commit();
			return true;
		} 
		finally {
		manager.close();
		}

	}
}
