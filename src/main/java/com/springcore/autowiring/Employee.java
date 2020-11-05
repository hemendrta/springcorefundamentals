package com.springcore.autowiring;

public class Employee {

	private Contact contact;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Contact contact) {
		super();
		this.contact = contact;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [contact=" + contact + "]";
	}

}
