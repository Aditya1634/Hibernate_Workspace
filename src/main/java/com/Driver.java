package com;

import javax.persistence.Persistence;

public class Driver {

	// In JDBC we use 2 steps;
	// Load the Driver software -> Class.forName
	// and establish connection -> DriverManager.getConnection()
	// In Hibernate we directly get a method EntityManagerFactory combining two steps
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No need to handle exceptions , all modern frameworks makes checked exception as unchecked
		Persistence.createEntityManagerFactory("postgres");
	}

}
