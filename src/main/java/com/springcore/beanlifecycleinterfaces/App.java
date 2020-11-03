package com.springcore.beanlifecycleinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		/*
		 * We have used interfaces InitializingBean, DisposableBean for the init and
		 * destroy part, both of them are having implementation methods which are by the
		 * name afterPropertiesSet and destroy and we have to do the implementation of
		 * the same. No need to have any referencing in the xml file.
		 */		
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/beanlifecycleinterfaces/beanlifecycleinterfacesconfig.xml");
		
		System.out.println(context.getBean("employee"));
		
		context.registerShutdownHook();
		
		/*
		 * Register hook ensures that the destroy method output is something which we
		 * get at the console.
		 */
		
	}

}
