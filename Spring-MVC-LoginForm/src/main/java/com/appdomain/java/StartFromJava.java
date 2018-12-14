package com.appdomain.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.appdomain.events.UserRegistrationEvent;

public class StartFromJava {
	
	public static void main(String[] args) {
		
		 ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("classpath*:spring-beans.xml");
/*		 
		 ApplicationContext context = new 
				 ClassPathXmlApplicationContext("classpath*:servlet-context.xml");*/
		 
		 System.out.println("spring-beans.xml loaded:"+context);
		 
/*		UserRegistrationEvent userRegistrationEvent = 
		         (UserRegistrationEvent) context.getBean("userRegistrationEvent");
		 userRegistrationEvent.setMailid("santhosh@gmail.com");

		 System.out.println("userRegistrationEvent:"+userRegistrationEvent);
		 
		 ApplicationEventPublisher appEventPublisherObject = 
		         (ApplicationEventPublisher) context.getBean("applicationEventPublisher");
		 
		 System.out.println("appEventPublisherObject:"+appEventPublisherObject);*/
		 
	}

}
