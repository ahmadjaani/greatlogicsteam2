package com.appdomain.eventlisteners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.appdomain.events.YoutubeSubscriptionEmailEvent;

@Component
public class YoutubeSubscriptionEmailEventListener implements ApplicationListener<YoutubeSubscriptionEmailEvent>{

	@Override
	public void onApplicationEvent(YoutubeSubscriptionEmailEvent event) {
		System.out.println("Email is sent to the  user");
		String emailID = event.getEmailID();
	}

}
