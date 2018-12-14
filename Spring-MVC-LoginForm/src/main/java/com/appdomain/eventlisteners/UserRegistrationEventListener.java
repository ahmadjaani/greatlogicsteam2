package com.appdomain.eventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.appdomain.events.UserRegistrationEvent;

@Component("userRegistrationEventListener")
public class UserRegistrationEventListener implements ApplicationListener<UserRegistrationEvent> {

	@Override
	public void onApplicationEvent(UserRegistrationEvent event) {
		
		System.out.println("My Job is send email to user:"+event.getMailid());
		
	}

}
