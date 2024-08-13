package com.tcs.org.bean;

public class EmployeeNew {
	int id;
	String gender;

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		gender = gender;
	}
	public EmployeeNew(int id, int age, String name, int doj, double salary, long number,String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
		this.number = number;
		this.gender= gender;
	}
	int age;
	String name;
	int doj;
	double salary;
	long number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "EmployeeNew [id=" + id + ", age=" + age + ", name=" + name + ", doj=" + doj + ", salary=" + salary
				+ ", number=" + number + "]";
	}
	
}
