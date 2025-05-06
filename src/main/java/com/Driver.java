package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	// In JDBC we use 2 steps;
	// Load the Driver software -> Class.forName
	// and establish connection -> DriverManager.getConnection()
	// In Hibernate we directly get a method EntityManagerFactory combining two steps
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No need to handle exceptions , all modern frameworks makes checked exception as unchecked
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s.setId(1);
		s.setName("Allen");
		
		et.begin();
		em.persist(s);
		et.commit();
		
		em.close();
		emf.close();
		
		System.out.println("Student Record Persisted successfully");
	}

}
