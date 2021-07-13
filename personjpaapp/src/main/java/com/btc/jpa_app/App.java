package com.btc.jpa_app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.btc.jpa_app.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("person.pu");
        EntityManager entityManager =factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        
        
		/*
		 * //add a new person 
		 * Person person1 = new
		 * Person(1001,"rahul","rahul@gmail.com",LocalDate.of(1992, 4, 18)); Person
		 * person2 = new Person(1002,"virat","virat@gmail.com",LocalDate.of(1983, 11,
		 * 05)); Person person3 = new
		 * Person(1003,"Rohit","rohit@gmail.com",LocalDate.of(1982, 5, 31)); tx.begin();
		 * entityManager.persist(person2); entityManager.persist(person3); tx.commit();
		 */ 
        //Fetching the Data
		
		/*
		 * Person person = entityManager.find(Person.class, 1001L);
		 * System.out.println(person); //update person.setEmail("rahul1101@gmail.com");
		 * tx.begin(); entityManager.persist(person); tx.commit();
		 */	  
        //delete
        
		/*
		 * Person person = entityManager.find(Person.class, 1001L); tx.begin();
		 * entityManager.remove(person); tx.commit();
		 */  
		 //fetch all persons
			/*
			 * TypedQuery findAll =entityManager.createQuery(" from Person",Person.class);
			 * List<Person>persons =findAll.getResultList(); persons.forEach(p->
			 * System.out.println(p));
			 */
			/* Typed Query
			 * TypedQuery<Person> findByName
			 * =entityManager.createQuery(" from Person where personName=:person_name"
			 * ,Person.class); findByName.setParameter("person_name", "virat"); Person
			 * person = findByName.getSingleResult(); System.out.println(person);
			 */
			/* Native query
			 * Query findByName =entityManager.
			 * createNativeQuery(" select * from Person_info where person_name=:person_name"
			 * ,Person.class); findByName.setParameter("person_name", "virat"); Person
			 * person = (Person)findByName.getSingleResult(); System.out.println(person);
			 */
        
        
        
        
    }
}
