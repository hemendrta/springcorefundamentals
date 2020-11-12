package com.springcore.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanscopes/config.xml");
		/*
		 * In the mentioned case below, we can see that we have created 2 objects but
		 * when we try to print the hashcode for both of them it gives us the same
		 * hashcode which means that only one object is returned everytime.
		 * 
		 * This is because whenever we request for the object of a bean which is managed by the bean container by default he scope of same is Singleton.
		 * 
		 * There are 2 ways of specifying the bean scope which are mentioned and used as per the configuration type:
		 * 
		 * In case of xml based configuration we define the scope in the bean tag as mentioned:
		 * 
		 * <bean class="ClassName" name"referenceName" scope="scopeType"/>
		 */		
		
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.hashCode());
		System.out.println(employee);
		
		Employee employee1 = context.getBean("employee", Employee.class);
		System.out.println(employee1.hashCode());
		System.out.println(employee1);
		
		/* Let us take the example of the class Person for the usage scope:
		 * 
		 * We have used annotation based system for defining the scope for the person class @Scope("prototype")
		 *  
		 *  In this case you will observe that for both the objects the hashcode is different as we are using the prototype scope.
		 */
		
		Person person=context.getBean("person", Person.class);
		System.out.println(person.hashCode());
		System.out.println(person);
		
		Person person1=context.getBean("person", Person.class);
		System.out.println(person1.hashCode());
		System.out.println(person1);
		
		
	}

}
