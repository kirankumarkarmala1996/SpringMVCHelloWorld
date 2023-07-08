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
//		Airtle air=(Airtle) context.getBean("airtle");
//		air.calling();
//		air.dial();
		
//		Idea ide=context.getBean("idea",Idea.class);
//		ide.calling();
//		ide.dial();
		
//		with out touch the source code  just change in beans.xml
		Sim sm=context.getBean("sim",Sim.class);
		sm.calling();
		sm.dial();
		
		
	}
}
