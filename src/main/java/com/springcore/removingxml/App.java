package com.springcore.removingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
In this example we have removed the xml file by the class which is named as ConfigClass and since in xml we do the configuration work thus this file to ensure that ApplicationContext recognizes it is annotated with @Configuration annotation, another thing in xml file we had a tag which is for component-scan which helped in identifying the package where the components where put and similalry over here as well we have annotation @ComponentScan in which we specify the package in which the classes which are annotated with @Component are kept.

To look for the implementation part of the same look for the following:

ConfigClass which is the configuration class with annotation @Configuration to identify as Configuration class and annotation @ComponentScan to specify in which package all the classes with annotation @Component are kept.

There is another way of creating a the bean by the means of which we do not have to annotate the class by the annotation @Component and the same method could be seen in the ConfigClass. In this case we also do not have to specify the @ComponentScan and @Component annotation.

Check the Employee class for reference which we have created this does not have annotation by the @Component but still we fetching the object of the same in this main. The point which needs to be taken care here is that since we have not specified any name for the bean in the ConfigClass and we are using the method getEmployee annotated with @Bean annotation to return the object thus to get the object by ApplicationContext object we have to pass the name of method which is returning the object rather than the camel case substitute which we use in general cases.

In this above method we do not require to use @ComponentScan annotation and also @Component annotation for the details you can check the class and the method. In the ConfigClass we have used the @ComponentScan since the Student bean is not being initialized by the same process.

*/
public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

		Student student = applicationContext.getBean("student", Student.class);

		System.out.println(student.hashCode());

		student.study();

		Employee employee = applicationContext.getBean("getEmployee", Employee.class);

		System.out.println(employee.hashCode());

		employee.work();
		/*
		 * 
		 * Output for the above program:
		 * 
		 * 1764696127 Student is Studying.... 1223867739 Employee is working!!!
		 * 
		 */ 
		}

}
