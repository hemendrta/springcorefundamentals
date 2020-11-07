package com.springcore.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Problem Statement:
	
What would be the case if we have 2 beans of same type with different names specified in the xml and we want to inject the one bean by the means of autowiring in that case there would be an ambiguity because it will be confused on which bean to inject.*/

/*In such cases we use @Qualifier which tells the dependency injection that ok the bean with this particular name needs to be injected from the set of beans which are available in the config file. In this example we have used adddress2 as the qualifier bean so the bean name with address2 from the config file will be injected.*/

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/qualifier/config.xml");

		System.out.println(context.getBean("employee", Employee.class));

	}

}
