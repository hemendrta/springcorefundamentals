package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 * Autowiring byName will look for a bean on which the bean class is dependent
		 * in the config.xml by the name which is of the variable for this example we
		 * have Address address so it will look for the beans which are by the name
		 * "address" in the config.xml and once the same is found it will be
		 * automatically injected. Important thing to remember is that in case we are
		 * using byName autowiring in that case the bean which is to be injected must
		 * have name same as the name specified in the bean where the dependency is to
		 * be injected. For details check in the config.xml and in the beans.
		 * 
		 * Person and address is the example for byName autowiring.
		 * 
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/config.xml");

		System.out.println(context.getBean("person", Person.class));

		System.out.println();

		/*
		 * Here we are using autowiring byType example so we need not to worry on the
		 * name which is declared over here as it would look in the config file for the
		 * type of dependency which is injected and once it find the same it will inject
		 * the same in the dependent bean.
		 * 
		 * Employee and Contact are the example for the same. For details on the
		 * declarations and syntax check config file and the beans.
		 */

		System.out.println(context.getBean("employee", Employee.class));

		System.out.println();
		/*
		 * Declaring the dependent bean in which the above bean is required to be
		 * injected since we are using the constructor autowiring thus it need not to be
		 * referenced by the same name as that in the dependent bean. For details check
		 * the bean classes and the config xml file.
		 */

		System.out.println(context.getBean("student", Student.class));
	}

}
