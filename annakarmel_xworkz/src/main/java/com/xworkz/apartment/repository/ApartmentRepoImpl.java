package com.xworkz.apartment.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.apartment.entity.ApartmentEntity;

@Repository
public class ApartmentRepoImpl implements ApartmentRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public  ApartmentRepoImpl() {
		
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(ApartmentEntity entity) {
		System.out.println("running save");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}
	
	@Override
	public ApartmentEntity findBy(int id) {
		System.out.println("running the find by id " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		ApartmentEntity entity = manager.find(ApartmentEntity.class, id);
		manager.close();
		return entity;
	}
	
	@Override
	public List<ApartmentEntity> findByplaces(String places){
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByplaces");
			query.setParameter("plac", places);
			List<ApartmentEntity> list = query.getResultList();
			System.out.println("Totl List found in repo "+list.size());
			return list;
		} finally {
			manager.close();
		}
	}
	
	@Override
	public boolean update(ApartmentEntity entity) {
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}
	
	
	@Override
	public boolean delete(int id) {
		System.out.println("Running delete");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ApartmentEntity entity = manager.find(ApartmentEntity.class, id);
		
		transaction.begin();
		manager.remove(entity);
		transaction.commit();
		manager.close();
		
		return true;
	}
}
