package com.springcore.beanlifecycle;

public class Person {

	private String personName;
	private String personCity;

	public Person(String personName, String personCity) {
		super();
		this.personName = personName;
		this.personCity = personCity;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + "]";
	}

	public void atStart() {

		System.out.println("Init method called!!!");

	}

	public void atCleanUp() {

		System.out.println("Destroy method called!!!");

	}

}
