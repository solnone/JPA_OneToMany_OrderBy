package com.java2s.common;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import javax.persistence.CascadeType;

@Entity
@Table(name = "person")
@org.hibernate.annotations.Table(comment = "人員", appliesTo = "person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;

	@Comment("姓名")
	private String name;
	
	@ManyToOne (cascade=CascadeType.ALL)
  private Department department;
	
  public Person() {}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, Department department) {
		this.name = name;
		this.department = department;
	}

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
    return "Person [id=" + id + ", name=" + name + "]";
  }

}