package com.appdomain.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appdomain.pojo.Employee;
import com.appdomain.service.EmployeeService;


@Controller
public class MyAccountController {

	private static final Logger log = Logger.getLogger(MyAccountController.class);

	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;
	
	@Autowired
	@Qualifier("employeeServiceImplUsingJDBCDaoSupport")
	private EmployeeService employeeServiceUsingJDBCDaoSupport;

	
	@RequestMapping(value = "/myAccount/{email}", method = RequestMethod.GET)
	public ModelAndView myAccount(@PathVariable(value = "email") String email, Model model) {
		
		System.out.println("email:"+email);
		
		Employee employeeByEmail = employeeService.getEmployeeByEmail(email);
		model.addAttribute("emp", employeeByEmail);
		
		ModelAndView modelView = new ModelAndView("myAccountPage");
		return modelView;
	}
	
	@RequestMapping(value = "/usingJDBC/myAccount/{email}", method = RequestMethod.GET)
	public ModelAndView myAccountUsingJDBCDaoSupport(@PathVariable(value = "email") String email, Model model) {
		
		System.out.println("email:"+email);
		
		Employee employeeByEmail = employeeServiceUsingJDBCDaoSupport.getEmployeeByEmail(email);
		
		model.addAttribute("emp", employeeByEmail);
		
		
		ModelAndView modelView = new ModelAndView("myAccountPage");
		return modelView;
	}
	
	@RequestMapping(value = "/usingJDBC/myAccount/mobileNumber/{mobileNumber}", method = RequestMethod.GET)
	public ModelAndView myAccountUsingMobileNumber(@PathVariable(value = "mobileNumber") String mobileNumber, Model model) {
		
		System.out.println("mobileNumber:"+mobileNumber);
		
		Employee employeeObject = employeeServiceUsingJDBCDaoSupport.getEmployeeByMobileNumber(mobileNumber);
		
		model.addAttribute("emp", employeeObject);
		
		
		ModelAndView modelView = new ModelAndView("myAccountPage");
		return modelView;
	}

	@RequestMapping(value = "/myAccount", method = RequestMethod.GET)
	public ModelAndView loginWithReqParam(@RequestParam(value = "email") String email, BindingResult result, Model model) {

		System.out.println("email:"+email);

		ModelAndView modelView = new ModelAndView("myAccountPage");
		return modelView;
	}

}
