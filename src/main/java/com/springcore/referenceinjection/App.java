package com.springcore.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

//		Initializing the context from where the bean would be requested

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/referenceinjection/referenceinjectionconfig.xml");

//		requesting the bean container for the bean which is managed by the container

		System.out.println(context.getBean("student1"));

//		Another way of initializing the property which is injected as a bean, look for the referenceinjectionconfig.xml for the details

		System.out.println(context.getBean("student2"));
		
//		Another way of initializing the property which is injected as a bean, look for the referenceinjectionconfig.xml for the details
		
		System.out.println(context.getBean("student3"));
		
	}

}
