package com.springcore.removingxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.removingxml")
public class ConfigClass {

	//This method will return the object of Employee. By this method we do not have to annotate the Employee class with @Component annotation.
	@Bean
	public Employee getEmployee() {

		return new Employee();

	}

}
