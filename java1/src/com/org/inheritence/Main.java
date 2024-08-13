package com.org.inheritence;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Exception1[] st= new Exception1[n];
		for(int i=0;i<n;i++) {
			try{
			String Name=sc.nextLine();
			   int age=sc.nextInt();sc.nextLine();
			   String Class=sc.nextLine();
			   String Branch=sc.nextLine();
			   st[i]= new Exception1(Name,age,Class,Branch);
		}catch(Exception e) {
			System.out.print("Enter the Details again");
			String Name=sc.nextLine();

			int age=sc.nextInt();sc.nextLine();
			   String Class=sc.nextLine();
			   String Branch=sc.nextLine();
			   st[i]= new Exception1(Name,age,Class,Branch);
		}
			}
		
		System.out.print(st.toString());
}}
class Student {
	  
	String Name;
	   int age;
	   String Class;
	   String Branch;
	   public Student(String name, int age, String class1, String branch) {
		super();
		Name = name;
		this.age = age;
		Class = class1;
		Branch = branch;
	}
	   @Override
		public String toString() {
			return "Student [Name=" + Name + ", age=" + age + ", Class=" + Class + ", Branch=" + Branch + "]";
		}
	}

