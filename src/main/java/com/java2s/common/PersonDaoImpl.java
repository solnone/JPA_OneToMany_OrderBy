package com.java2s.common;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PersonDaoImpl {
  public void test(){
    Department d = new Department("Design");
    Set<Person> persons = d.getPersons();
    persons.add(new Person("Tom", d));
    persons.add(new Person("Jack", d));
    em.persist(d);
  }
  
	@PersistenceContext
	private EntityManager em;
}
