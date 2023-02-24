package com.xworkz.festivalDB.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotal {

	public static void main(String[] args) {
		System.out.println("Running in FindTotal");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotal");
		Object obj = query.getSingleResult();
		Long ln = (Long) obj;
		System.out.println(ln);
		manager.close();
	}

}
