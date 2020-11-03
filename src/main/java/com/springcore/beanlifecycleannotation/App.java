package com.springcore.beanlifecycleannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Improtant things:
		 * 
		 * AbstractApplicationContext is required to registerShutdownHook as
		 * ApplicationContext and BeanFactory do not provide any method like this. To
		 * use @PostConstruct and @PreDestroy we have to add a dependency if we are
		 * using java 8 and above which is
		 * 
		 * "<dependency>\r\n" + "			<groupId>javax.annotation</groupId>\r\n" +
		 * "			<artifactId>javax.annotation-api</artifactId>\r\n" +
		 * "			<version>1.3.2</version>\r\n" + "		</dependency>"
		 * 
		 * We have to enable the annotations to ensure that the annotations for
		 * PostConstruct and PreDestroy are working fine and for the same we need to
		 * enable annotations and to do that we use ( <context:annotation-config />).
		 */
			

		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/beanlifecycleannotation/config.xml");
		
		System.out.println(abstractApplicationContext.getBean("employee",Employee.class));
		
		abstractApplicationContext.registerShutdownHook();
		
		
	}

}
