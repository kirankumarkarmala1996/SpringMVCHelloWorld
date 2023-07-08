package com.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
//		Airtle  airtle = new Airtle();
//		
//		airtle.dial();
//		airtle.calling();

//		<!-- https://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd"> -->
//			<!-- https://www.springframework.org/schema/mvc/spring-mvc.xsd -->

		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config Load");
		
		
	
	}
}
