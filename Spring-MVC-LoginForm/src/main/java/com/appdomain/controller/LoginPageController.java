package com.appdomain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appdomain.forms.LoginForm;
import com.appdomain.forms.validators.LoginFormValidator;


@Controller
public class LoginPageController {

	private static final Logger log = Logger.getLogger(LoginPageController.class);
	
	@Autowired
	private LoginFormValidator loginFormValidator;
	
	@RequestMapping(value={"/getLoginPage","/login"}, method= RequestMethod.GET)
	public ModelAndView getLoginPage(Model model,HttpServletRequest req, HttpServletResponse resp){
		ModelAndView modelView = new ModelAndView("loginPage");
		System.out.println("I am inside this getLoginPage()");
		LoginForm loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return modelView;
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("loginForm")@Valid LoginForm loginForm , BindingResult result, Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("errorMessage","something went wrong!!");
			return new ModelAndView("loginPage");
		}

		ModelAndView modelView = new ModelAndView("loginPage");
		return modelView;
	}
	
	@RequestMapping(value = "/loginWithPathVariable/{email}/{password}", method = RequestMethod.GET)
	public ModelAndView loginWithParamMapping(@PathVariable(value = "email") String email,
			@PathVariable(value = "password") String password, Model model) {

		System.out.println("email:"+email);
		System.out.println("password:"+password);

		ModelAndView modelView = new ModelAndView("loginPage");
		return modelView;
	}

	@RequestMapping(value = "/loginWithReqParam", method = RequestMethod.GET)
	public ModelAndView loginWithReqParam(@RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password, BindingResult result, Model model) {

		System.out.println("email:"+email);
		System.out.println("password:"+password);

		ModelAndView modelView = new ModelAndView("loginPage");
		return modelView;
	}

}
