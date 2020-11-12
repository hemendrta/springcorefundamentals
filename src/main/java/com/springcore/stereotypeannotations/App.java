package com.springcore.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	/* We are using stereo-type annotations in this example: */
	/*
	 * Benefit of using the stereo annotations is that we need not configure the
	 * bean in the xml file we can directly annotate our bean with @Component and
	 * the same life-cycle will be managed by the bean container.
	 * 
	 * So rather writing the mentioned code like:
	 * 
	 * <bean class="" name="">
	 * 
	 * <property>
	 * 
	 * <value></value>
	 * 
	 * </property>
	 * 
	 * </bean>
	 * 
	 * We would have to specify the package name in which the same is placed so that
	 * it can scan the beans which needs to be managed by the bean container.
	 * 
	 * Mentioned is the tag in which we have to specify the base package.
	 * 
	 * <context:component-scan base-package=""></context:component-scan>
	 * 
	 * This component scan will look for all the classes in the packages and subpackages with the annotation @component or @bean and will manage the life-cycle for 
	 * the same
	 */
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotypeannotations/config.xml");
		
		/*
		 * In case of xml based configuration we defined the name tag by the name which
		 * we requested for the bean from container, in this case if we do not specify
		 * the name by the bean inside the @Component tag then it will be using the
		 * camel case for the bean class object generation or else we can define the
		 * name something as mentioned:
		 * 
		 * @Component("studentdemo")
		 * 
		 */		
		
		System.out.println(context.getBean("employee",Employee.class));
		
		/*
		 * consider for an example we used the annotation @Component with the specific
		 * bean name say emp for the same we have the mentioned:
		 */
			
		/* System.out.println(context.getBean("emp",Employee.class)); */
		
		/* Employee [employeeName=null, employeeDepartment=null] is the output for the above.*/
		/*
		 * In both the above cases we will be getting null values the variables since in
		 * this case we have not assigned the value, in case of xml we did that by using
		 * either setter injection or constructor injection, we can initialize the
		 * values using the @Value annotation, have a look in the bean class.
		 * 
		 */	
		
		/* Usage of the mentioned above case initializing values */
		
		System.out.println(context.getBean("employee",Employee.class));
		
		}

}
