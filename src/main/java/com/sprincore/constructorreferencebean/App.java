package com.sprincore.constructorreferencebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sprincore/constructorreferencebean/constructorreferenceconfig.xml");
		
//		Requesting for the bean to the container in which the values are initialized by using constructor injection
		
		System.out.println(context.getBean("product"));
		
//		Asking for the bean to the context where we have used another way of initializing the values to constructor
		
		System.out.println(context.getBean("product1"));
		
	}

}
