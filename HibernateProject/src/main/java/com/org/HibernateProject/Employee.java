package com.org.HibernateProject;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity  
@Table(name= "Employee") 
public class Employee {
	private int id;
	private String name;
	private int age;
	private String Dept;
	
	
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "AGE")
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "Dept")
	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	
	
 
	public Employee(){
 
	}
 
	
}