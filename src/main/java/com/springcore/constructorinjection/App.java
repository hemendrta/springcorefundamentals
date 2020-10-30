package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorinjectionconfig.xml");
		
//		Calling the bean which is managed by the bean container and the values of which are initialized using constructor injection
		
		System.out.println(context.getBean("employee"));
		
//		Calling the bean which is managed by the bean container and the values of which are initialized using constructor injection but with modification in assigning
		
		System.out.println(context.getBean("employee1"));
		
	}

}
