package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Person {
	
	@Id
	private Integer personId;
	private String personName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer personId, String personName) {
		super();
		personId = personId;
		personName = personName;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	

}
