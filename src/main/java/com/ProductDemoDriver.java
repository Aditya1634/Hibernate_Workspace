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
		
//		et.begin();
//		String s = "Select p from ProductDemo p where p.price = ?1";
//		Query q = em.createQuery(s);
//		q.setParameter(1, 5000.0);
//		List<ProductDemo> li = q.getResultList();
//		ProductDemo p = (ProductDemo) q.getSingleResult();
//		et.commit();
//		System.out.println(p.getName());
//		li.forEach(al->System.out.println(al.getId()+" "+al.getName()+" "+al.getPrice()));
		
//		deleteByPrice(5000.0);
		findByPrice(50000.0);
	}
	
	public static void deleteByPrice(double price) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String jpql = "delete from ProductDemo p where p.price=?1";
		et.begin();
		Query query = em.createQuery(jpql);
		query.setParameter(1,price);
		query.executeUpdate();
		et.commit();
	}
	
	public static void findByPrice(double price) {
		EntityManager em = Persistence.createEntityManagerFactory("postgres").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		String jpql = "select p from ProductDemo p where p.price=?1";
//		Query by variable parameter
		String jpql = "select p from ProductDemo p where p.price=:productprice";
		
		et.begin();
		Query query = em.createQuery(jpql);
		query.setParameter("productprice",price);

		ProductDemo res = (ProductDemo) query.getSingleResult();
		System.out.println(res.getName());
		et.commit();
	}
}
