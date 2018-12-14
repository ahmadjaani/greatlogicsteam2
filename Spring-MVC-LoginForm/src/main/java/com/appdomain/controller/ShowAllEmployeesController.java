package com.appdomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.appdomain.dto.SpringEmployeeDTO;
import com.appdomain.service.GetAllEmployeesServiceInterface;

@Controller
public class ShowAllEmployeesController {
	
	@Autowired
	private GetAllEmployeesServiceInterface getAllEmployeesService;
	
	
	@RequestMapping(value="/showAllEmployees",method=RequestMethod.GET)
	public ModelAndView getAllEmployeesFromDBAndDisplay(Model model){

		List<SpringEmployeeDTO> springEmployees = getAllEmployeesService.getAllEmployeesFromDB();
		model.addAttribute("myEmployees", springEmployees);
		
		for (SpringEmployeeDTO springEmployeeDTO : springEmployees) {
			System.out.println("firstname:"+springEmployeeDTO.getFirstName());
			System.out.println("lastname:"+springEmployeeDTO.getLastName());
		}
		
		ModelAndView modelAndViewObject = new ModelAndView("showAllEmployees");
		return modelAndViewObject;
	}

}
