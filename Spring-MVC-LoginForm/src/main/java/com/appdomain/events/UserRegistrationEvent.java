package com.appdomain.events;

import org.springframework.context.ApplicationEvent;

public class UserRegistrationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	String mailid;
	

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public UserRegistrationEvent(Object source) {
		super(source);
	}

}
