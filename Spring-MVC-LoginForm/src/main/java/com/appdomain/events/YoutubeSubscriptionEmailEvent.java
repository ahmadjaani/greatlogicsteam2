package com.appdomain.events;

import org.springframework.context.ApplicationEvent;

public class YoutubeSubscriptionEmailEvent extends ApplicationEvent{

	
	String emailID;
	
	
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}




	public YoutubeSubscriptionEmailEvent(Object source) {
		super(source);
	} 

}
