package com.org.aac;

public abstract class Employee {
     public Employee(String name, String iD, String department) {
		super();
		Name = name;
		ID = iD;
		Department = department;
	}

	String Name;
     String ID;
     String Department;
     
     void m1(String Name,String ID) {
    	 System.out.print(Name+ ID);
     }
   
}
//
//class Engineer extends Employee{
//	Engineer(String name,String iD){
//		super();
//		Name = name;
//		ID = iD;
//}}
