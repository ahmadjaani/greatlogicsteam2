package com.appdomain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.appdomain.dto.UserDTO;
import com.appdomain.events.UserRegistrationEvent;
import com.appdomain.forms.UserRegistrationForm;
import com.appdomain.forms.validators.UserRegistrationFormValidator;
import com.appdomain.service.EmployeeRegistrationService;

@Controller
public class RegistrationPageController {

	@Autowired
	private UserRegistrationFormValidator userRegistrationFormValidator;
	
	@Autowired
	private EmployeeRegistrationService employeeRegistrationService;

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	@RequestMapping(value="/getUserRegistrationPage", method= RequestMethod.GET)
	public ModelAndView getUserRegistrationPage(Model model,HttpServletRequest req, HttpServletResponse resp){
		ModelAndView modelView = new ModelAndView("userRegistrationPage");
		System.out.println("I am inside this getUserRegistrationPage()");
		UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
		model.addAttribute("userRegistrationForm", userRegistrationForm);
		model.addAttribute("key","Welcome to user registration page");
		return modelView;
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("userRegistrationForm") UserRegistrationForm userRegistrationForm,
			BindingResult result, Model model) {

		userRegistrationFormValidator.validate(userRegistrationForm, result);

		if(result.hasErrors()){
			model.addAttribute("errorMessage","something went wrong!!");
			return new ModelAndView("userRegistrationPage");
		}

		UserDTO userData = new UserDTO();
		userData.setFirstName(userRegistrationForm.getFirstName());
		userData.setLastName(userRegistrationForm.getLastName());
		userData.setContactEmail(userRegistrationForm.getContactEmail());
		userData.setMobileNumber(userRegistrationForm.getMobileNumber());
		userData.setPassword(userRegistrationForm.getPassword());
		userData.setImage(userRegistrationForm.getImage());

		employeeRegistrationService.insertEmployeeInToDB(userData);
		
		UserRegistrationEvent userRegistrationEvent = new UserRegistrationEvent(this);
		userRegistrationEvent.setMailid(userData.getContactEmail());
		
		applicationEventPublisher.publishEvent(userRegistrationEvent);

		ModelAndView modelView = new ModelAndView("success");
		model.addAttribute("user",userData);
		return modelView;
	}
}
