package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Stand alone list is basically in which we can define a list or collection outside the bean and can use the same in any of the bean as a property, we define a util list and provide a id to the same and the we use the same in the bean in the property as bean injection.

The benefit of using the same is that we can specify the type of the list as well in this case which was not possible in the case we initialize the same using the property injections earlier.

to use the util collection we have to define the collection outside the bean as defined in the config file and mentioned are the added things in config file:
	
		http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util-3.1.xsd
        	
        xmlns:util="http://www.springframework.org/schema/util
*/

/*Another thing is that we can also specify the class of the collection. In the mentioned example we have class ArrayList of the first and LinkedList for the second.*/

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalonecollections/config.xml");

		System.out.println(context.getBean("employee", Employee.class));
		System.out.println(context.getBean("employee", Employee.class).getEmployeeDepartments().getClass());

		System.out.println();

		System.out.println(context.getBean("employee1", Employee.class));
		System.out.println(context.getBean("employee1", Employee.class).getEmployeeDepartments().getClass());

		System.out.println();

		System.out.println(context.getBean("employee1", Employee.class));
		System.out.println(context.getBean("employee1", Employee.class).getEmployeeInfo());
		System.out.println(context.getBean("employee1", Employee.class).getEmployeeInfo().getClass());

		System.out.println();

		System.out.println(context.getBean("employee", Employee.class));
		System.out.println(context.getBean("employee", Employee.class).getEmployeeInfo());
		System.out.println(context.getBean("employee", Employee.class).getEmployeeInfo().getClass().getName());

		System.out.println();
		System.out.println(context.getBean("person", Person.class));
	}

}
