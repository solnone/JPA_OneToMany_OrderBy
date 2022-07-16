package com.java2s.common;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name = "department")
@org.hibernate.annotations.Table(comment = "部門", appliesTo = "department")
public class Department {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
  
  @Comment("部門名稱")
  private String name;
  
  @OneToMany(targetEntity=Person.class, mappedBy="department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @OrderBy("name ASC")
  private Set<Person> persons = new HashSet<Person>();
  
  public Department() {

  }

  public Department(String name) {
    this.name = name;
  }

  public Set<Person> getPersons() {
    return persons;
  }

  public void setPersons(Set<Person> persons) {
    this.persons = persons;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Department [id=" + id + ", name=" + name + ", persons=" + persons
        + "]";
  }

}
