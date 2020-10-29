package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	We are just specifying the context that our configuration file in by the name config where the bean details are located
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
//        Requesting the context to send us the bean Student 
        
        Student student=(Student)context.getBean("student1");
        
        System.out.println(student);
        
//        Asking from context to provide us the bean which we have declared to be managed in the config.xml
        
        System.out.println(context.getBean("session1"));
        
//        We are just checking in the below code what are the default values assigned if we do not assign the values to the bean
        
        System.out.println(context.getBean("session2"));
        
//        Another way of initializing the values to the bean which can be referred in the config
        
        	System.out.println(context.getBean("student2"));
        
    }
}
