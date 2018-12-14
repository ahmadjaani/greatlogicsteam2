package com.appdomain.service;

import com.appdomain.pojo.Employee;

public interface EmployeeService {

	Employee getEmployeeByEmail(String email);

	Employee getEmployeeByMobileNumber(String mobileNumber);
	
}
