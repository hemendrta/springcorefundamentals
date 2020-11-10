package com.springcore.standalonecollections;

import java.util.Properties;

public class Person {

	private Properties properties;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Properties properties) {
		super();
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [properties=" + properties + "]";
	}

}
