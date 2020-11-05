package com.springcore.autowiring;

public class Person {

	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}


}
