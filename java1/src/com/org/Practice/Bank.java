package com.org.Practice;

public class Bank {
	public static void setEmployee(Employee[] employee) {
		Bank.employee = employee;
	}

	public static void setBankName(String bankName) {
		BankName = bankName;
	}

private static Employee[] employee;
private static 	String BankName;


Bank(Employee[] employee, String BankName){
	this.employee= employee;
	this.BankName=BankName;
}

}
