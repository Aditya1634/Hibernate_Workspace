package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		String s = "Select s from StudentDemo s where s.name=?1";
		Query q = em.createQuery(s);
		q.setParameter(1, "Smith");
		List<StudentDemo> li = q.getResultList();
		et.commit();
		System.out.println(li);
		li.forEach(al->System.out.println(al));
	}

}
