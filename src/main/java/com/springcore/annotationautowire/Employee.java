package com.springcore.annotationautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String employeeName;
	
	
	private Contact contact;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * If we put the @Autowired annotation above the constructor then it will be
	 * using constructor way of inserting the reference bean and for this we should
	 * be have a constructor with required argument type as this one mentioned
	 * below. One constructor with one argument of contact type.
	 */
	
	
	public Employee(Contact contact) {
		
		this.contact=contact;
	}
	
	public Employee(String employeeName, Contact contact) {
		
		this.employeeName = employeeName;
		this.contact = contact;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Contact getContact() {
		return contact;
	}

	@Autowired
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", contact=" + contact + "]";
	}

}
