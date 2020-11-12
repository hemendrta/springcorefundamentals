package com.springcore.collectionvalueannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*

To pass the list as value in the bean we need to create a util list as created in the config file and then in @Value just above the property we have to use spring expression tag to inject the list by the id.

*/

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collectionvalueannotation/config.xml");
		System.out.println(context.getBean("employee", Employee.class));
		
	}

}
