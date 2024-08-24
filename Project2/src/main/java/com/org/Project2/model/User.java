package com.org.Project2.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	Integer id;
	public User(Integer id, String name, String phone, String email, Address address) {
		super();
		this.id = id;
		Name = name;
		Phone = phone;
		Email = email;
		Address = address;
	}
	String Name;
	String Phone;
	String Email;
	Address Address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}

}
