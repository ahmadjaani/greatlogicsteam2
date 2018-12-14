package com.appdomain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdomain.dao.EmployeeRegistrationDao;
import com.appdomain.dto.UserDTO;
import com.appdomain.service.EmployeeRegistrationService;

@Service("employeeRegistrationService")
public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService {

	@Autowired
	private EmployeeRegistrationDao employeeRegistrationDao;
	
	@Override
	public void insertEmployeeInToDB(UserDTO userData) {
		
		employeeRegistrationDao.insertEmployeeInToDB(userData);

	}

}
