package com.appdomain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {
	
	
	@RequestMapping(value="/spring",method=RequestMethod.GET)
	public String printWelcome(Model model){
		
		model.addAttribute("anyMessage", "Welcome to spring session!!");
		
		return "welcome";
	}
	
	@RequestMapping(value="/java",method=RequestMethod.GET)
	public String printJavaWelcome(Model model){
		
		model.addAttribute("anyMessage", "Welcome to Java session!!");
		
		return "welcome";
	}
	
	@RequestMapping(value="/springboot",method=RequestMethod.GET)
	public String printHtmlWelcome(Model model){
		
		model.addAttribute("anyMessage", "Welcome to springboot session!!");
		
		return "welcome";
	}

}
