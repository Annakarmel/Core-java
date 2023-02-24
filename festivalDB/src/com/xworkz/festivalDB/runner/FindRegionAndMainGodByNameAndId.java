package com.xworkz.festivalDB.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {

	public static void main(String[] args) {
		System.out.println("Running in FindRegionAndMainGodByNameAndId");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		Object obj = query.getSingleResult();
		Object[] arr =(Object[])obj;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		manager.close();
	}

}
