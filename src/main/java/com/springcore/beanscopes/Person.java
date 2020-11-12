package com.springcore.beanscopes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("person")
@Scope("prototype")
public class Person {

	@Value("Sunny Singh Chouhan")
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
