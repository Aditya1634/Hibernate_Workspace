package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		et.begin();
//		ProductDemo pd = new ProductDemo();
//		pd.setName("TV");
//		pd.setPrice(250000);
//		pd.setQuantity(10);
//		
//		em.persist(pd);
//		et.commit();
		
		et.begin();
		String s = "Select p from ProductDemo p where p.price >= ?1";
		Query q = em.createQuery(s);
		q.setParameter(1, 5000.0);
		List<ProductDemo> li = q.getResultList();
		et.commit();
		li.forEach(al->System.out.println(al));
	}

}
