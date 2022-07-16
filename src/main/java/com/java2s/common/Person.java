package com.java2s.common;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
	 
	private String name;
	
	@ManyToOne (cascade=CascadeType.ALL)
  private Department department;
	
  public Person() {}

	public Person(String name) {
		this.name = name;
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