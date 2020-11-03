package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Request the bean container to get bean which is being managed by it.

//		ApplicationContext context=
//		new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/beanlifecycleconfig.xml");

//		System.out.println(context.getBean("employee",Employee.class));
		/*
		 * Output for the above mentioned line is:
		 * 
		 * Inside the init method!!! Employee [employeeName=Hemendra Singh Chouhan,
		 * employeeCity=Indore]
		 */

		/*
		 * Since we have defined the init and destroy methods in the config xml file
		 * thus it has the reference for both but the problem is that we need a hook so
		 * that it can show the destroy method just before the object destruction which
		 * is not a part of ApplicationContext. Hook is provided by the
		 * AbstractApplicationContext.
		 */

		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/beanlifecycle/beanlifecycleconfig.xml");

		abstractApplicationContext.registerShutdownHook();

		System.out.println(abstractApplicationContext.getBean("employee", Employee.class));
		/*
		 * Output for the above code is:
		 * 
		 * Inside the init method!!! Employee [employeeName=Hemendra Singh Chouhan,
		 * employeeCity=Indore] Inside the destroy method!!!
		 */
		
		/*
		 * Example to show that we can have different names of the init and destroy
		 * methods in the bean class, it is the referencing which matters, check the xml
		 * file.
		 */
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println(abstractApplicationContext.getBean("person", Person.class));

	}

}
