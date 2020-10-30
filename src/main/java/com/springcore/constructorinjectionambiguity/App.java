package com.springcore.constructorinjectionambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorinjectionambiguity/constructorinjectionambiguityconfig.xml");

//		Requesting the bean from the bean container

		/*
		 * Output for the mentioned code is:
		 * 
		 * Double constructor is called NumberMultiply [num1=10, num2=20]
		 * 
		 */

		System.out.println(context.getBean("numMultiply1"));

		/*
		 * Even though the constructor or the values which we have initialized are in
		 * the integer format still the double constructor is passed, this is because of
		 * the ambiguity. It will look for the order in which the constructors are
		 * called and since it is finding the double constructor thus it has assumed
		 * that the values which we are passing are double.
		 */

		/*
		 * To overcome the above mentioned problem we have specified the type of
		 * argument which we are passing in the argument and in this way only the
		 * constructor which is having the required or specific type of argument will be
		 * called.
		 */

		System.out.println(context.getBean("numMultiply2"));

		/*
		 * Note that by default if in case we do not specify the type of the argument
		 * which we are passing then it is taken as string and if in that case we have
		 * string constructor then it would surely be calling the String constructor
		 * then in that case order will also be not given the preference.
		 */

	}

}
