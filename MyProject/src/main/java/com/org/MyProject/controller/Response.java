package com.org.MyProject.controller;

public class Response {
Integer code;

public Response(Integer code, String message) {
	super();
	this.code = code;
	this.message = message;
}
String message;


@Override
public String toString() {
	return "Response [code=" + code + ", message=" + message + "]";
}
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

}
