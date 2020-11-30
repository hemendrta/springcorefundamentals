package com.springcore.springexpressionlangauge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	
	public static void main(String[] args) {
		
		/* Look in the bean to see how we pass the value in the expression tag */
		/* #{expression which can be evaluated} */
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/springexpressionlangauge/config.xml");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
		
		/*
		 * There is a class which is SpelExpressionParser which could be used in many
		 * ways one of the way is mentioned for reference:
		 */
			
		SpelExpressionParser parser=new SpelExpressionParser();
		Expression expression = parser.parseExpression("{22+33}");
		System.out.println(expression.getValue());
		
	}

}
