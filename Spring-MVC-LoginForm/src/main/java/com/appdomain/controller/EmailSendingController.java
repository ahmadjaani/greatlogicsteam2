package com.appdomain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.appdomain.events.YoutubeSubscriptionEmailEvent;

@Controller
public class EmailSendingController {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	@RequestMapping(value="sendEmailController/{useremail}")
	public ModelAndView sendEmail(Model model,@PathVariable String useremail){
		
		YoutubeSubscriptionEmailEvent eventObj = new YoutubeSubscriptionEmailEvent(this);
		eventObj.setEmailID(useremail);
		applicationEventPublisher.publishEvent(eventObj);
		
		
		ModelAndView mv = new ModelAndView("sampleemail");
		return mv;
	}
	
	
	@RequestMapping(value="youtubesubscribe")
	public ModelAndView subscribetomychannel(Model model){
		
		ModelAndView mv = new ModelAndView("youtubesubscribe");
		return mv;
	}
	
	
}
