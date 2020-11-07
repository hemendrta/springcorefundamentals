package com.springcore.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	private String employeeName;

	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, Address address) {
		super();
		this.employeeName = employeeName;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address=" + address + "]";
	}

}
