package com.springcore.collectionvaluesinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/collectionvaluesinjection/newconfig.xml");
		
//		calling the bean maintained by container
		
		System.out.println(context.getBean("employee1"));
		
		System.out.println();
		
		Employee employee=(Employee) context.getBean("employee1");
		
		System.out.println(employee.getEmployeeName()+"\n"+employee.getEmployeeContact()+"\n"+employee.getEmployeeDepartment()+"\n"+employee.getAssignedManager());
	}

}
