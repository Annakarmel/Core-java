package com.xworkz.festivalDB.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivalDB.entity.FestivalEntity;

public class FindByNameAndRegionAndMainGodRunner {

	public static void main(String[] args) {
		System.out.println("Running in FindByNameAndRegionAndMainGod");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		Object obj = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) obj;
		System.out.println(entity);
		manager.close();
	}

}
