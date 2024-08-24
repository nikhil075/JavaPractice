package com.org.Project2.model;

import java.util.List;

public class Response {
Integer code;

String message;
List<User> user;
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}


public Response(Integer code, String message, List<User> user) {
	super();
	this.code = code;
	this.message = message;
	this.user = user;
}
}
